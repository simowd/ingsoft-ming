package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StoreBl {
    private GameDao gameDao;
    private PriceDao priceDao;
    private PhotoDao photoDao;
    private UserDao userDao;
    private OrderDao orderDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(StoreBl.class);

    @Autowired
    public StoreBl(GameDao gameDao, PriceDao priceDao, PhotoDao photoDao, UserDao userDao, OrderDao orderDao) {
        this.gameDao = gameDao;
        this.priceDao = priceDao;
        this.photoDao = photoDao;
        this.userDao = userDao;
        this.orderDao = orderDao;
    }

    /*
    The user gets a paginated view of the homepage
     */
    public List<HomepageRequest> getHomePage(Integer page) {
        List<HomepageRequest> list = new ArrayList<HomepageRequest>();
        //Setup the query's page limit fir the SQL query
        Integer recordsPerPage = 10;
        Integer offsetValue = (page - 1) * recordsPerPage;

        List<Game> games = gameDao.findPage(recordsPerPage, offsetValue);
        //Verifying the existance of the games.
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Price price = priceDao.findById(ids.get(i));
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                if (price != null && photo != null) {
                    //Create a desired object and then put it on the list
                    HomepageRequest homepageRequest = new HomepageRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), price.getPrice(), price.getSale().doubleValue(), photo.getPhotoPath());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

    /*
    Search query for all the games that are currently in the database
     */
    public List<HomepageRequest> getSearchData(String search) {
        List<HomepageRequest> list = new ArrayList<HomepageRequest>();
        List<Game> games = gameDao.searchQuery("%" + search.toLowerCase() + "%");
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Price price = priceDao.findById(ids.get(i));
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                if (price != null && photo != null) {
                    //Create a desired object and then put it on the list
                    HomepageRequest homepageRequest = new HomepageRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), price.getPrice(), price.getSale().doubleValue(), photo.getPhotoPath());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

    /*
    Gets all the highlighted games in the database.
     */
    public List<HighlightRequest> getHighLights() {
        List<HighlightRequest> list = new ArrayList<HighlightRequest>();
        List<Game> games = gameDao.findHighlight();
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                if (photo != null) {
                    //Create a desired object and then put it on the list
                    HighlightRequest homepageRequest = new HighlightRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), games.get(i).getDescription(), photo.getPhotoPath());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

    /*
    Search query for all the games that are currently on sale
     */

    public List<SaleRequest> SalePage() {
        // Get games that have sale
        List<Game> game = gameDao.findSale();
        // Get the on sale game ids
        List<Integer> gameIds = gameDao.findSaleIds();
        // Get sale Prices
        List<Price> price = priceDao.findByIdGame(gameIds);
        // Get on sale game banners
        List<Photo> photo = photoDao.findBannerbyId(gameIds);

        // Call Sale request dto
        List<SaleRequest> sale = new ArrayList<>();

        // Set Sale Request values
        for (int i = 0; i < game.size(); i++) {
            sale.add(new SaleRequest(game.get(i).getName(), game.get(i).getReleaseDate(), price.get(i).getPrice(), price.get(i).getSale(), photo.get(i).getPhotoPath()));
        }
        return sale;
    }

    /*
    Returns a list of the games that have a release date range of the last seven days
     */
    public List<ReleaseRequest> getLatest() {
        List<ReleaseRequest> list = new ArrayList<ReleaseRequest>();
        List<Game> games = gameDao.findLatestReleases();
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Price price = priceDao.findById(ids.get(i));
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                if (price != null && photo != null) {
                    //Create a desired object and then put it on the list
                    ReleaseRequest homepageRequest = new ReleaseRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), games.get(i).getDescription(), price.getPrice(), photo.getPhotoPath(), games.get(i).getReleaseDate());
                    list.add(homepageRequest);
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
