package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@Service
public class PublisherBl {

    private PublisherDao publisherDao;
    private UserDao userDao;
    private TransactionDao transactionDao;
    private OrderDao orderDao;
    private GameDao gameDao;
    private DeveloperDao developerDao;
    private PriceDao priceDao;
    private PhotoDao photoDao;
    private CountryDao countryDao;

    @Autowired
    public PublisherBl(PublisherDao publisherDao, UserDao userDao, TransactionDao transactionDao, OrderDao orderDao, GameDao gameDao, DeveloperDao developerDao, PriceDao priceDao, PhotoDao photoDao, CountryDao countryDao) {
        this.publisherDao = publisherDao;
        this.userDao = userDao;
        this.transactionDao = transactionDao;
        this.orderDao = orderDao;
        this.gameDao = gameDao;
        this.developerDao = developerDao;
        this.priceDao = priceDao;
        this.photoDao = photoDao;
        this.countryDao = countryDao;
    }


    /*
        POST (/publisher) The admin create a new publisher
    */
    public void createPublisher(PublisherRequest publisherRequest, Transaction transaction){

        User user=new User();
        Publisher publisher=new Publisher();

        // Insert data in user table
        user.setIdCountry(publisherRequest.getIdCountry());
        user.setUserName(publisherRequest.getUsername());
        user.setPassword(publisherRequest.getPassword());
        user.setEmail(publisherRequest.getEmail());
        user.setTxId(transaction.getTxId());
        user.setTxHost(transaction.getTxHost());
        user.setTxUserId(transaction.getTxUserId());
        user.setTxDate(transaction.getTxDate());
        userDao.createPublisher(user);

        // Insert data in publisher table
        Integer lastId=userDao.getLastInsertId();
        publisher.setIdUser(lastId);
        publisher.setPaypalMail(publisherRequest.getPaypal());
        publisher.setPublisher(publisherRequest.getPublisher());
        publisher.setTxId(transaction.getTxId());
        publisher.setTxHost(transaction.getTxHost());
        publisher.setTxUserId(transaction.getTxUserId());
        publisher.setTxDate(transaction.getTxDate());
        publisherDao.createPublisher(publisher);
    }
    /*
      GET (/publisher/{id}) shows publisher data
    */
    public PublisherRequest findByPublisherId (Integer idUser){

        PublisherRequest publisherRequest=new PublisherRequest();
        User user= userDao.findByUserId(idUser);
        if(user.getUserType() != 1 || user.getStatus()==0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
        Publisher publisher=publisherDao.findByPublisherId(idUser);

        publisherRequest.setUsername(user.getUserName());
        publisherRequest.setEmail(user.getEmail());
        publisherRequest.setPaypal(publisher.getPaypalMail());
        publisherRequest.setPublisher(publisher.getPublisher());
        publisherRequest.setIdCountry(user.getIdCountry());
        publisherRequest.setPassword(user.getPassword());
        publisherRequest.setRepeat_password(user.getPassword());

        return publisherRequest;
    }
    /*
       GET (/publisher) The admin sees a publisher list
    */
    public List<PublisherListRequest> getPublisherList(){
        List<PublisherListRequest> publisherListRequests =new ArrayList<PublisherListRequest>();
        List<User> user=userDao.listUserMails();

        List<Integer> ids = new ArrayList<Integer>();
        for(User users : user){
            ids.add(users.getIdUser());
        }

        List<Publisher> publisher=publisherDao.listPublisher(ids);
        for(int i=0;i< user.size();i++){
            PublisherListRequest publisherListRequest=new PublisherListRequest();

            publisherListRequest.setIdUser(user.get(i).getIdUser());
            publisherListRequest.setEmail(user.get(i).getEmail());
            publisherListRequest.setPaypal(publisher.get(i).getPaypalMail());
            publisherListRequest.setPublisher(publisher.get(i).getPublisher());

            publisherListRequests.add(publisherListRequest);
        }
        return publisherListRequests;
    }
    /*
        DELETE (/publisher/{id}) The admin delete a publisher account
    */
    public void deletePublisher (Integer idUser, Transaction transaction){
      userDao.deleteUserPublisher(idUser);
      publisherDao.deletePublisher(idUser);
      String users = "users", publishers="publishers";
      transactionDao.updateTablesTransaction(users,idUser, transactionDao.getLastInsertId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
      transactionDao.updateTablesTransaction(publishers,idUser, transactionDao.getLastInsertId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
    }

    /*
       PUT (/publisher/{id}) The publisher can update his account
   */
    public PublisherRequest updatePublisher(PublisherRequest publisherRequest, Transaction transaction, Integer userId){
        User user=new User();
        Publisher publisher=new Publisher();
        User user1= userDao.findByUserId(userId);
        if(user1.getUserType() != 1 || user1.getStatus()==0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
        }
        user.setIdUser(userId);
        user.setIdCountry(publisherRequest.getIdCountry());
        user.setUserName(publisherRequest.getUsername());
        user.setPassword(publisherRequest.getPassword());
        user.setEmail(publisherRequest.getEmail());
        user.setTxId(transaction.getTxId());
        user.setTxHost(transaction.getTxHost());
        user.setTxUserId(transaction.getTxUserId());
        user.setTxDate(transaction.getTxDate());

        String oldPassword =user.getPassword();
        String newPassword =publisherRequest.getRepeat_password();
        if((oldPassword).equals(newPassword)){
            userDao.updateUser(user);
            publisher.setIdUser(userId);
            publisher.setPaypalMail(publisherRequest.getPaypal());
            publisher.setPublisher(publisherRequest.getPublisher());
            publisher.setTxId(transaction.getTxId());
            publisher.setTxHost(transaction.getTxHost());
            publisher.setTxUserId(transaction.getTxUserId());
            publisher.setTxDate(transaction.getTxDate());

            publisherDao.updatePublisher(publisher);

        }else{
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Wrong Password");
        }

        return publisherRequest;

    }
    // Get the publisher statistics
    public DashboardRequest PublisherDashboard(Integer idUser){
        // Publisher Name, Mail and Paypalmail
        Publisher pubId=publisherDao.findByPublisherId(idUser);
        User mail=userDao.publisherMail(idUser);
        // Publisher's developers ids
        List<Integer> developer=developerDao.findByPublisher(pubId.getIdPublisher());

        //Publisher games ids
        List<Integer> game=gameDao.findGamebyPublisher(developer);
        // Publisher total sells and total earnings
        Integer totalSells=orderDao.gameSellsPublisher(game);
        Double totalEarnings=orderDao.gameEarnings(game);
        // Month list
        List<Integer> months=new ArrayList<>();
        for (int i=1;i<=12;i++){
            months.add(i);
        }
        // Monthly statistics
        List<monthlyDashboard> monthlyEarnings=orderDao.gameEarningsMonth(game,months);
        // Countries ids
        List<Integer> countries=orderDao.gameOrderCountry(game);
        // Country statistics
        List<countryDashboard> totalCountrySells=orderDao.gameOrderCountryCount(game,countries);

        // Games statistics
        List<gameDashboard> gameSells=orderDao.gameSellsGame(game);


        // Call dashboardrequest dto
        DashboardRequest dashboardRequest=new DashboardRequest();
        // Set dashboard values
        dashboardRequest.setPublisher(pubId.getPublisher());
        dashboardRequest.setEmail(mail.getEmail());
        dashboardRequest.setPaypal(pubId.getPaypalMail());
        dashboardRequest.setSells(totalSells);
        dashboardRequest.setEarnings(totalEarnings);
        dashboardRequest.setMonthlyData(monthlyEarnings);
        dashboardRequest.setCountryData(totalCountrySells);
        dashboardRequest.setGameData(gameSells);
        // Return object dashboardrequest for the method
        return dashboardRequest;

    }

}
