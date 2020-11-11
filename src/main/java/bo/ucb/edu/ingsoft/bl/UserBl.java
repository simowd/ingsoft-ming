package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBl {
    private UserDao userDao;
    private CountryDao countryDao;
    private TransactionDao transactionDao;
    private GameDao gameDao;
    private LibraryDao libraryDao;
    private GenreDao genreDao;
    private PhotoDao photoDao;
    private OrderDao orderDao;
    private PriceDao priceDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserBl.class);

    @Autowired
    public UserBl(UserDao userDao, CountryDao countryDao, TransactionDao transactionDao, GameDao gameDao, LibraryDao libraryDao, GenreDao genreDao, PhotoDao photoDao, OrderDao orderDao, PriceDao priceDao) {
        this.userDao = userDao;
        this.countryDao = countryDao;
        this.transactionDao = transactionDao;
        this.gameDao = gameDao;
        this.libraryDao = libraryDao;
        this.genreDao = genreDao;
        this.photoDao = photoDao;
        this.orderDao = orderDao;
        this.priceDao = priceDao;
    }

    /*
    GET (/users/{id}) The user sees his profile info
    */
    public UserRequest userProfileInfo(Integer idUser) {
        User user = userDao.userProfileInfo(idUser);
        Country country = countryDao.CountryName(user.getIdCountry());
        UserRequest userRequest = new UserRequest(user.getUserName(), user.getAlias(), user.getEmail(), country.getName(), user.getPhotoPath());
        return userRequest;
    }

    /*
    PUT (/users/{id}) The user can edit his profile info
    */
    public void changeUserPassword(Integer userId, PasswordRequest passwordRequest, Transaction transaction) {
        String currentPassword = userDao.userPassword(userId).getPassword();
        String oldPassword = passwordRequest.getOld_password();
        if (new String(oldPassword).equals(currentPassword)){
            userDao.updateUserPassword(userId, passwordRequest.getNew_password());
            transactionDao.updateUserTransaction(userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
        }else
        {
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Wrong Password");
        }
    }

    /*
    PUT (/users/{id}/password) The user can edit his password
    */
    public void updateUserProfileInfo(Integer userId, UserRequest userRequest, Transaction transaction) {
        User user = new User();
        user.setIdUser(userId);
        user.setAlias(userRequest.getAlias());
        user.setEmail(userRequest.getEmail());
        user.setIdCountry(userRequest.getId_country());
        user.setPhotoPath(userRequest.getPhoto_path());

        userDao.updateUserInfo(user);
        transactionDao.updateUserTransaction(userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
    }

    /*
    GET (/users/{id}/library) The user sees his game library
    */
    public List<LibraryRequest> getUserLibrary(Integer userId) {
        List<LibraryRequest> list = new ArrayList<LibraryRequest>();
        List<Integer> userIdGames = libraryDao.UserGames(userId);
        List<Game> gameInfo = gameDao.findLibraryGames(userIdGames);

        List<List<String>> genresList = new ArrayList<List<String>>();
        for (int i = 0; i < userIdGames.size(); i++) {
            List<String> gameGenre = genreDao.gameGenre(userIdGames.get(i));
            genresList.add(gameGenre);
        }
        List<Photo> gameBanner = photoDao.findBannerbyId(userIdGames);

        for (int i = 0; i < userIdGames.size(); i++) {

            LibraryRequest libraryRequest = new LibraryRequest(userIdGames.get(i), gameInfo.get(i).getName(), genresList.get(i), gameBanner.get(i).getPhotoPath(), gameInfo.get(i).getDownloadPath());
            list.add(libraryRequest);
        }
        return list;
    }

    public List<GameDetailsRequest> getCartByUser(Integer userId) {
        // Getting games from cart by user id
        List<GameDetailsRequest> detailsRequests = orderDao.getCartUser(userId);

        // Print cart details information
        LOGGER.info(detailsRequests.toString());

        return detailsRequests;
    }

    public GameDetailsRequest addGameToCart(Integer userId, Integer gameId, Transaction transaction) {
        // Getting game information by game id
        Game game = gameDao.getGameInfo(gameId);

        // Getting user information by user id
        User user = userDao.findByUserId(userId);

        // Getting price information by game id
        Price price = priceDao.findById(game.getIdGame());

        // Print game details information
        LOGGER.info(game.toString());

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
        LOGGER.info(order.toString());

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
        LOGGER.info(orderDetail.toString());

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

    public void deleteGameFromCart(Integer userId, Integer gameId, Transaction transaction) {
        // Gets rows from order details
        List<Integer> integerList = orderDao.getOrderDetailGameByUser(gameId, userId);

        // Setting status to removed from cart. This is a logical deletion
        integerList.forEach(integer -> orderDao.updateOrder(2, integer));

        // Print if the game is deleted from cart
        LOGGER.info("Games deleted from cart");
    }

    public List<GameDetailsRequest> purchaseGamesCart(Integer userId, Transaction transaction) {
        // Gets all games on cart by user id
        List<GameDetailsRequest> detailsRequests = orderDao.getCartUser(userId);

        // Warn what games are in there
        LOGGER.warn(detailsRequests.toString());

        // Gets rows from order details
        List<Integer> integerList = orderDao.getOrderDetailByUser(userId);

        // Setting status to game bought.
        integerList.forEach(integer -> orderDao.updateOrder(1, integer));

        return detailsRequests;
    }

}
