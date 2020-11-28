package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreBl {
    private GameDao gameDao;
    private PriceDao priceDao;
    private PhotoDao photoDao;
    private UserDao userDao;
    private OrderDao orderDao;
    private DeveloperDao developerDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(StoreBl.class);

    @Autowired
    public StoreBl(GameDao gameDao, PriceDao priceDao, PhotoDao photoDao, UserDao userDao, OrderDao orderDao, DeveloperDao developerDao) {
        this.gameDao = gameDao;
        this.priceDao = priceDao;
        this.photoDao = photoDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
        this.developerDao = developerDao;
    }

    /*
    The user gets a paginated view of the homepage
     */
    public List<GamesRequest> getGames(Integer page, String query, Boolean highlight, Boolean latest, Boolean sale, String publisher) {
        List<GamesRequest> list = new ArrayList<GamesRequest>();
        LOGGER.info(query);
        //Setup the query's page limit fir the SQL query
        Integer recordsPerPage = 10;
        Integer offsetValue = (page - 1) * recordsPerPage;

        if (query != null) {
            query = "%" + query.toLowerCase() + "%";
        }
        GameHelper gameHelper = new GameHelper(recordsPerPage, offsetValue, query, highlight, latest, sale, publisher);
        List<Game> games = gameDao.findPage(gameHelper);
        LOGGER.info(games.toString());
        //Verifying the existance of the games.
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Price price = priceDao.findById(ids.get(i));
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                Developer developer = developerDao.findByIdDeveloper(games.get(i).getIdDeveloper());
                if (price != null && photo != null) {
                    //Create a desired object and then put it on the list
                    GamesRequest gamesRequest = new GamesRequest(ids.get(i).toString(), games.get(i).getName(), games.get(i).getDescription(), developer.getDeveloper(), price.getPrice(), price.getSale(), photo.getPhotoPath(), games.get(i).getHighlight(), games.get(i).getReleaseDate().toString(), games.get(i).getColor());
                    list.add(gamesRequest);
                }
            }
        }
        return list;
    }

    public PaymentRequest getGamePayment(PaymentRequest paymentRequest, Transaction transaction) {
        // Print transaction information
        LOGGER.info(transaction.toString());

        // Getting game information by game id
        Game game = gameDao.getGameInfo(paymentRequest.getIdGame());

        // Print game information
        LOGGER.info(game.toString());

        // Getting user information by user id from paymentRequest
        User user = userDao.findByUserId(paymentRequest.getIdUser());

        // Print user information
        LOGGER.info(user.toString());

        // Getting price information by game id
        Price price = priceDao.findById(game.getIdGame());

        // Print price information
        LOGGER.info(price.toString());

        // Loading data from user and transaction into Order
        Orders orders = new Orders();
        orders.setIdUser(user.getIdUser());
        orders.setDate(transaction.getTxDate());

        // Setting status game bought
        orders.setStatus(1);
        orders.setTxId(transaction.getTxId());
        orders.setTxHost(transaction.getTxHost());
        orders.setTxUserId(transaction.getTxUserId());
        orders.setTxDate(transaction.getTxDate());

        // Create a new order in DataBase
        orderDao.createOrder(orders);

        // Setting id to the current order
        orders.setIdOrder(orderDao.getLastInsertId());

        // Print orders information
        LOGGER.info(orders.toString());

        // Loading data from game, orders and price into order details
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setIdGame(game.getIdGame());
        orderDetails.setIdOrder(orders.getIdOrder());
        orderDetails.setPrice(price.getPrice());

        // Setting status game bought
        orderDetails.setStatus(1);
        orderDetails.setTxId(transaction.getTxId());
        orderDetails.setTxHost(transaction.getTxHost());
        orderDetails.setTxUserId(transaction.getTxUserId());
        orderDetails.setTxDate(transaction.getTxDate());

        // Create a new row on order_details in DataBase
        orderDao.createOrderDetails(orderDetails);

        // Print orderDetails information
        LOGGER.info(orderDetails.toString());

        // Setting data from game, price and user to return the result
        paymentRequest.setTitle(game.getName());
        paymentRequest.setPrice(price.getPrice());
        paymentRequest.setUsername(user.getUserName());
        paymentRequest.setName(user.getName());
        paymentRequest.setLastname(user.getLastName());
        paymentRequest.setAlias(user.getAlias());
        paymentRequest.setCountry(user.getIdCountry().toString());

        return paymentRequest;
    }

}
