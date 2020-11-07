package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.PublisherDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.PublisherRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.models.Country;
import bo.ucb.edu.ingsoft.models.Developer;
import bo.ucb.edu.ingsoft.models.Publisher;
import bo.ucb.edu.ingsoft.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PublisherBl {

    private PublisherDao publisherDao;
    private UserDao userDao;
    private TransactionDao transactionDao;


    @Autowired
    public PublisherBl(PublisherDao publisherDao, UserDao userDao, TransactionDao transactionDao) {
        this.publisherDao = publisherDao;
        this.userDao = userDao;
        this.transactionDao = transactionDao;
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

}
