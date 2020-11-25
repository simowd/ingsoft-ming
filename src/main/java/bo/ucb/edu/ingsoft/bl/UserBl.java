package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
@Slf4j
public class UserBl {
    private final  UserDao userDao;
    private final CountryDao countryDao;
    private final TransactionDao transactionDao;
    private final GameDao gameDao;
    private final LibraryDao libraryDao;
    private final GenreDao genreDao;
    private final PhotoDao photoDao;
    private final OrderDao orderDao;
    private final PriceDao priceDao;


    /*
    POST (/users/signup) The user creates an account
    */
    public UserRequest userSignUp(UserRequest userRequest, Transaction transaction){
        User user=new User();

        user.setName(userRequest.getName());
        user.setLastName(userRequest.getLastname());
        user.setUserName(userRequest.getUsername());
        user.setAlias(userRequest.getAlias());
        user.setEmail(userRequest.getEmail());
        user.setPassword((userRequest.getPassword()));
        user.setTxId(transaction.getTxId());
        user.setTxHost(transaction.getTxHost());
        user.setTxUserId(transaction.getTxUserId());
        user.setTxDate(transaction.getTxDate());
        userDao.userSignUp(user);

        Integer lastId=userDao.getLastInsertId();
        String tableUsers = "users";
        transactionDao.updateTablesTransaction(tableUsers, lastId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());

        UserRequest newUser = new UserRequest();
        newUser.setId_user(userDao.getLastInsertId());
        return newUser;
    }

    /*
    GET (/users/{id}) The user sees his profile info
    */
    public UserRequest userProfileInfo(Integer idUser) {
        // Getting user information by user id
        User user = userDao.userProfileInfo(idUser);
        if(user == null || user.getStatus() == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }

        Country country = countryDao.CountryName(user.getIdCountry());
        if(country == null || country.getStatus() == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }

        UserRequest userRequest = new UserRequest(user.getUserName(), user.getAlias(), user.getEmail(), country.getName(), user.getPhotoPath());
        return userRequest;
    }

    /*
    PUT (/users/{id}) The user can edit his profile info
    */
    public void updateUserProfileInfo(Integer userId, UserRequest userRequest, Transaction transaction) {
        // Getting user information by user id
        User userInfo = userDao.userProfileInfo(userId);
        if(userInfo == null || userInfo.getStatus() == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
        User user = new User();
        user.setIdUser(userId);
        user.setName(userRequest.getName());
        user.setLastName(userRequest.getLastname());
        user.setAlias(userRequest.getAlias());
        user.setEmail(userRequest.getEmail());
        user.setIdCountry(userRequest.getId_country());
        user.setPhotoPath(userRequest.getPhoto_path());

        userDao.updateUserInfo(user);
        String tableUsers = "users";
        transactionDao.updateTablesTransaction(tableUsers, userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
    }

    /*
    PUT (/users/{id}/password) The user can edit his password
    */
    public void changeUserPassword(Integer userId, PasswordRequest passwordRequest, Transaction transaction) {
        // Getting user information by user id
        User user = userDao.userProfileInfo(userId);
        if(user == null || user.getStatus() == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }

        String currentPassword = userDao.userPassword(userId).getPassword();
        String oldPassword = passwordRequest.getOld_password();

        if (new String(oldPassword).equals(currentPassword)) {
            userDao.updateUserPassword(userId, passwordRequest.getNew_password());
            String tableUsers = "users";
            transactionDao.updateTablesTransaction(tableUsers, userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
        } else {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Wrong Password");
        }
    }

    /*
    GET (/users/{id}/library) The user sees his game library
    */
    public List<LibraryRequest> getUserLibrary(Integer userId) {
        // Getting library information by user id
        User user = userDao.userProfileInfo(userId);
        if(user == null || user.getStatus() == 0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }

        List<LibraryRequest> list = new ArrayList<LibraryRequest>();
        List<Integer> userIdGames = libraryDao.UserGames(userId);

        if (!userIdGames.isEmpty()){
            for (int i = 0; i < userIdGames.size(); i++){
                Game game = gameDao.getGameInfo(userIdGames.get(i));
                List<String> genre = genreDao.gameGenre(userIdGames.get(i));
                Photo photo = photoDao.findBannerbyGame(userIdGames.get(i));
                String photo_path = null;
                if (photo != null){
                    photo_path = photo.getPhotoPath();
                }
                LibraryRequest libraryRequest = new LibraryRequest(userIdGames.get(i), game.getName(), genre, photo_path, game.getDownloadPath());
                list.add(libraryRequest);
            }
        }
        return list;
    }

    /*
    GET (/users/{id}) The user sees a combobox with countries ids and names.
    */
    public List<CountryRequest> getCountries() {
        List<Country> country = countryDao.CountriesList();
        List<CountryRequest> list = new ArrayList<CountryRequest>();
        for (int i = 0; i < country.size(); i++){
            CountryRequest countryRequest = new CountryRequest(country.get(i).getIdCountry(),country.get(i).getName());
            list.add(countryRequest);
        }

        return list;
    }

    public List<GameDetailsRequest> getCartByUser(Integer userId) {
        // Getting games from cart by user id
        List<GameDetailsRequest> detailsRequests = orderDao.getCartUser(userId);

        // Print cart details information
        log.info(detailsRequests.toString());

        if (detailsRequests.size() > 0)
            return detailsRequests;
        else
            return new ArrayList<>();
    }

    public GameDetailsRequest addGameToCart(Integer userId, Integer gameId, Transaction transaction) {
        // Getting game information by game id
        Game game = gameDao.getGameInfo(gameId);

        // Getting user information by user id
        User user = userDao.findByUserId(userId);

        // Getting price information by game id
        Price price = priceDao.findById(game.getIdGame());

        // Print game details information
        log.info(game.toString());

        // Loading data from user and transaction into Order
        Orders order = new Orders();
        order.setIdUser(user.getIdUser());
        order.setDate(transaction.getTxDate());

        // Setting status current game on cart
        order.setStatus(0);
        order.setTxId(transaction.getTxId());
        order.setTxHost(transaction.getTxHost());
        order.setTxUserId(transaction.getTxUserId());
        order.setTxDate(transaction.getTxDate());

        // Create a new order in Database
        orderDao.createOrder(order);

        // Setting id to the current order
        order.setIdOrder(orderDao.getLastInsertId());

        // Print order information
        log.info(order.toString());

        // Loading data from game, order and price into order details
        OrderDetails orderDetail = new OrderDetails();
        orderDetail.setIdGame(game.getIdGame());
        orderDetail.setIdOrder(order.getIdOrder());
        orderDetail.setPrice(price.getPrice());

        // Setting status current game on cart
        orderDetail.setStatus(0);
        orderDetail.setTxId(transaction.getTxId());
        orderDetail.setTxHost(transaction.getTxHost());
        orderDetail.setTxUserId(transaction.getTxUserId());
        orderDetail.setTxDate(transaction.getTxDate());

        // Create a new row on order_details in DataBase
        orderDao.createOrderDetails(orderDetail);

        // Print orderDetails information
        log.info(orderDetail.toString());

        // Setting data from game and price to return the result
        GameDetailsRequest gameDetailsRequest = new GameDetailsRequest();
        gameDetailsRequest.setId(game.getIdGame());
        gameDetailsRequest.setTitle(game.getName());
        gameDetailsRequest.setPrice(price.getPrice());
        gameDetailsRequest.setPlayers(game.getPlayers());
        gameDetailsRequest.setSize(game.getSize());

        // gameDetailsRequest is the information of the game bought
        return gameDetailsRequest;
    }

    public void deleteGameFromCart(Integer userId, Integer gameId) {
        // Gets rows from order details
        List<Integer> integerList = orderDao.getOrderDetailGameByUser(gameId, userId);

        if (integerList.size() > 0){
            // Setting status to removed from cart. This is a logical deletion
            integerList.forEach(integer -> orderDao.updateOrder(2, integer));

            // Print if the game is deleted from cart
            log.info("Games deleted from cart");
        } else {
            // Print if the game is not deleted from cart
            log.info("Games is not found. Game wasn't deleted");
        }


    }

    public List<GameDetailsRequest> purchaseGamesCart(Integer userId, Transaction transaction) {
        // Gets all games on cart by user id
        List<GameDetailsRequest> detailsRequests = orderDao.getCartUser(userId);

        // Warn what games are in there
        log.warn(detailsRequests.toString());

        // Gets rows from order details
        List<Integer> integerList = orderDao.getOrderDetailByUser(userId);

        // Setting status to game bought.
        integerList.forEach(integer -> orderDao.updateOrder(1, integer));

        return detailsRequests;
    }

}
