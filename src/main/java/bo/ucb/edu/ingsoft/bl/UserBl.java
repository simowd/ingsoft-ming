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
//        List<GameDetailsRequest> gameDetailsRequests = new ArrayList<>();
//        LOGGER.warn(gameDetailsRequests.toString() + userId);
        List<GameDetailsRequest> detailsRequests = orderDao.getCartUser(userId);
        LOGGER.warn(detailsRequests.toString());
        return detailsRequests;
    }

    public GameDetailsRequest addGameToCart(Integer userId, Integer gameId, Transaction transaction) {
        LOGGER.warn(userId + " " + gameId);
        Game game = gameDao.getGameInfo(gameId);
        User user = userDao.findByUserId(userId);
        Price price = priceDao.findById(game.getIdGame());
        LOGGER.warn(game.toString());

        Orders orders = new Orders();
        orders.setIdUser(user.getIdUser());
        orders.setDate(transaction.getTxDate());
        orders.setStatus(0);
        orders.setTxId(transaction.getTxId());
        orders.setTxHost(transaction.getTxHost());
        orders.setTxUserId(transaction.getTxUserId());
        orders.setTxDate(transaction.getTxDate());
        orderDao.createOrder(orders);
        orders.setIdOrder(orderDao.getLastInsertId());
        LOGGER.warn(orders.toString());

        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setIdGame(game.getIdGame());
        orderDetails.setIdOrder(orders.getIdOrder());
        orderDetails.setPrice(price.getPrice());
        orderDetails.setStatus(0);
        orderDetails.setTxId(transaction.getTxId());
        orderDetails.setTxHost(transaction.getTxHost());
        orderDetails.setTxUserId(transaction.getTxUserId());
        orderDetails.setTxDate(transaction.getTxDate());
        orderDao.createOrderDetails(orderDetails);
        LOGGER.warn(orderDetails.toString());

        GameDetailsRequest gameDetailsRequest = new GameDetailsRequest();
        gameDetailsRequest.setId(game.getIdGame());
        gameDetailsRequest.setTitle(game.getName());
        gameDetailsRequest.setPrice(price.getPrice());
        gameDetailsRequest.setPlayers(game.getPlayers());
        gameDetailsRequest.setSize(game.getSize());


        return gameDetailsRequest;
    }

    public void deleteGameFromCart(Integer userId, Integer gameId, Transaction transaction) {
        LOGGER.warn(userId + " " + gameId);
        List<Integer> integerList = orderDao.getOrderDetailGameByUser(gameId, userId);
        integerList.forEach(integer -> {
            orderDao.updateOrder(2, integer);
        });
        LOGGER.info("Games deleted from cart");
    }

    public List<GameDetailsRequest> purchaseGamesCart(Integer userId, Transaction transaction) {
        LOGGER.warn(userId + " ");
        List<GameDetailsRequest> detailsRequests = orderDao.getCartUser(userId);
        LOGGER.warn(detailsRequests.toString());
        List<Integer> integerList = orderDao.getOrderDetailByUser(userId);
        integerList.forEach(integer -> {
            orderDao.updateOrder(1, integer);
        });
        return detailsRequests;
    }

}
