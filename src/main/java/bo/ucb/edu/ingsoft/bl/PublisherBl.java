package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.DashboardRequest;
import bo.ucb.edu.ingsoft.dto.PublisherRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.models.Country;
import bo.ucb.edu.ingsoft.models.Developer;
import bo.ucb.edu.ingsoft.models.Publisher;
import bo.ucb.edu.ingsoft.models.User;
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

    @Autowired
    public PublisherBl(PublisherDao publisherDao, UserDao userDao, TransactionDao transactionDao, OrderDao orderDao, GameDao gameDao, DeveloperDao developerDao) {
        this.publisherDao = publisherDao;
        this.userDao = userDao;
        this.transactionDao = transactionDao;
        this.orderDao = orderDao;
        this.gameDao = gameDao;
        this.developerDao = developerDao;
    }




    public PublisherRequest createPublisher(PublisherRequest publisherRequest, Transaction transaction){

        User user=new User();
        Publisher publisher=new Publisher();

        user.setIdCountry(publisherRequest.getCountry());
        user.setUserName(publisherRequest.getUsername());
        user.setPassword(publisherRequest.getPassword());
        user.setEmail(publisherRequest.getEmail());
        user.setTxId(transaction.getTxId());
        user.setTxHost(transaction.getTxHost());
        user.setTxUserId(transaction.getTxUserId());
        user.setTxDate(transaction.getTxDate());
        userDao.createPublisher(user);

        Integer lastId=userDao.getLastInsertId();
        publisher.setIdUser(lastId);
        publisher.setPaypalMail(publisherRequest.getPaypal());
        publisher.setPublisher(publisherRequest.getPublisher());
        publisher.setTxId(transaction.getTxId());
        publisher.setTxHost(transaction.getTxHost());
        publisher.setTxUserId(transaction.getTxUserId());
        publisher.setTxDate(transaction.getTxDate());

        publisherDao.createPublisher(publisher);

        return publisherRequest;
    }

    public PublisherRequest findByPublisherId (Integer idUser){
        PublisherRequest publisherRequest=new PublisherRequest();
        User user= userDao.findByUserId(idUser);
        Publisher publisher=publisherDao.findByPublisherId(idUser);

        publisherRequest.setUsername(user.getUserName());
        publisherRequest.setEmail(user.getEmail());
        publisherRequest.setPaypal(publisher.getPaypalMail());
        publisherRequest.setPublisher(publisher.getPublisher());
        publisherRequest.setCountry(user.getIdCountry());
        publisherRequest.setPassword(user.getPassword());
        publisherRequest.setRepeat_password(user.getPassword());

        return publisherRequest;
    }

    public List<PublisherRequest> getPublisherList(){
        List<PublisherRequest> publisherRequest =new ArrayList<PublisherRequest>();
        List<User> user=userDao.listUserMails();

        List<Integer> ids = new ArrayList<Integer>();
        for(User users : user){
            ids.add(users.getIdUser());
        }

        List<Publisher> publisher=publisherDao.listPublisher(ids);
        for(int i=0;i< user.size();i++){
            PublisherRequest publisherRequest1=new PublisherRequest();

            publisherRequest1.setEmail(user.get(i).getEmail());
            publisherRequest1.setPaypal(publisher.get(i).getPaypalMail());
            publisherRequest1.setPublisher(publisher.get(i).getPublisher());

            publisherRequest.add(publisherRequest1);
        }

        return publisherRequest;
    }

    public void deletePublisher (Integer idUser, Transaction transaction){
      userDao.deleteUserPublisher(idUser);
      publisherDao.deletePublisher(idUser);
      transactionDao.updateUserTransaction(idUser, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
    }

    public PublisherRequest updatePublisher(PublisherRequest publisherRequest, Transaction transaction, Integer userId){
        User user=new User();
        Publisher publisher=new Publisher();

        user.setIdUser(userId);
        user.setIdCountry(publisherRequest.getCountry());
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

    public DashboardRequest PublisherDashboard(Integer idUser){
        Publisher pubId=publisherDao.findByPublisherId(idUser);
        User mail=userDao.publisherMail(idUser);

        List<Integer> developer=developerDao.findByPublisher(pubId.getIdPublisher());


        List<Integer> game=gameDao.findGamebyPublisher(developer);

        Integer totalSells=orderDao.gameSellsPublisher(game);
        Double totalEarnings=orderDao.gameEarnings(game);

        List<Integer> months=new ArrayList<>();
        for (int i=1;i<=12;i++){
            months.add(i);
        }

        List<Double> monthlyEarnings=orderDao.gameEarningsMonth(game,months);
        List<Integer> totalCountrySells=orderDao.gameOrderCountryCount(game);
        List<Integer> countries=orderDao.gameOrderCountry(game);
        List<Integer> gameSells=orderDao.gameSellsGame(game);



        DashboardRequest dashboardRequest=new DashboardRequest();

        dashboardRequest.setPublisher(pubId.getPublisher());
        dashboardRequest.setEmail(mail.getEmail());
        dashboardRequest.setPaypal(pubId.getPaypalMail());
        dashboardRequest.setSells(totalSells);
        dashboardRequest.setEarnings(totalEarnings);
        dashboardRequest.setMonthly_earnings(monthlyEarnings);
        dashboardRequest.setCountry_earnings(totalCountrySells);
        dashboardRequest.setGame_earnings(gameSells);

        return dashboardRequest;

    }



}
