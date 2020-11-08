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

    public List<HomepageRequest> getHomePage(Integer page) {
        List<HomepageRequest> list = new ArrayList<HomepageRequest>();
        Integer recordsPerPage = 10;
        Integer offsetValue = (page - 1) * recordsPerPage;
        List<Game> games = gameDao.findPage(recordsPerPage, offsetValue);
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Price price = priceDao.findById(ids.get(i));
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                if (price != null && photo != null) {
                    HomepageRequest homepageRequest = new HomepageRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), price.getPrice(), price.getSale().doubleValue(), photo.getPhotoPath());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

    public List<HomepageRequest> getSearchData(String search) {
        List<HomepageRequest> list = new ArrayList<HomepageRequest>();
        List<Game> games = gameDao.searchQuery("%" + search + "%");
        if (!games.isEmpty()) {
            List<Integer> ids = new ArrayList<Integer>();
            for (Game game : games) {
                ids.add(game.getIdGame());
            }
            for (int i = 0; i < ids.size(); i++) {
                Price price = priceDao.findById(ids.get(i));
                Photo photo = photoDao.findBannerbyGame(ids.get(i));
                if (price != null && photo != null) {
                    HomepageRequest homepageRequest = new HomepageRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), price.getPrice(), price.getSale().doubleValue(), photo.getPhotoPath());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

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
                    HighlightRequest homepageRequest = new HighlightRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), games.get(i).getDescription(), photo.getPhotoPath());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

    public List<SaleRequest> SalePage() {

        List<Game> game = gameDao.findSale();
        List<Integer> gameIds = gameDao.findSaleIds();
        List<Price> price = priceDao.findByIdGame(gameIds);
        List<Photo> photo = photoDao.findBannerbyId(gameIds);

        List<SaleRequest> sale = new ArrayList<>();


        for (int i = 0; i < game.size(); i++) {
            sale.add(new SaleRequest(game.get(i).getName(), game.get(i).getReleaseDate(), price.get(i).getPrice(), price.get(i).getSale(), photo.get(i).getPhotoPath()));
        }
        return sale;
    }

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
                    ReleaseRequest homepageRequest = new ReleaseRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), games.get(i).getDescription(), price.getPrice(), photo.getPhotoPath(), games.get(i).getReleaseDate());
                    list.add(homepageRequest);
                }
            }
        }
        return list;
    }

    public PaymentRequest getGamePayment(PaymentRequest paymentRequest, Transaction transaction) {
        Game game = gameDao.getGameInfo(paymentRequest.getIdGame());
        User user = userDao.findByUserId(paymentRequest.getIdUser());
        Price price = priceDao.findById(game.getIdGame());
        LOGGER.warn(transaction.toString());
        LOGGER.warn(game.toString());
        Orders orders = new Orders();
        orders.setIdUser(user.getIdUser());
        orders.setDate(transaction.getTxDate());
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
        orderDetails.setTxId(transaction.getTxId());
        orderDetails.setTxHost(transaction.getTxHost());
        orderDetails.setTxUserId(transaction.getTxUserId());
        orderDetails.setTxDate(transaction.getTxDate());
        orderDao.createOrderDetails(orderDetails);
        LOGGER.warn(orderDetails.toString());


        paymentRequest.setTitle(game.getName());
        paymentRequest.setPrice(price.getPrice());
//        paymentRequest.setLatest(getLatest());

        paymentRequest.setUsername(user.getUserName());
        paymentRequest.setName(user.getName());
        paymentRequest.setLastname(user.getLastName());
        paymentRequest.setAlias(user.getAlias());
        paymentRequest.setCountry(user.getIdCountry().toString());
//        paymentRequest.setSale();


        return paymentRequest;
    }

}
