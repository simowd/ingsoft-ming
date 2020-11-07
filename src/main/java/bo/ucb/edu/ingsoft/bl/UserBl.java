package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.CountryDao;
import bo.ucb.edu.ingsoft.dao.TransactionDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.PasswordRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.models.Country;
import bo.ucb.edu.ingsoft.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserBl {
    private UserDao userDao;
    private CountryDao countryDao;
    private TransactionDao transactionDao;

    @Autowired
    public UserBl(UserDao userDao, CountryDao countryDao, TransactionDao transactionDao) {
        this.userDao = userDao;
        this.countryDao = countryDao;
        this.transactionDao = transactionDao;
    }

    public UserRequest userProfileInfo(Integer idUser){
        User user = userDao.userProfileInfo(idUser);
        Country country = countryDao.CountryName(user.getIdCountry());
        UserRequest userRequest = new UserRequest(user.getUserName(),user.getAlias(),user.getEmail(),country.getName(),user.getPhotoPath());
        return userRequest;
    }


    public void changeUserPassword(Integer userId, PasswordRequest passwordRequest, Transaction transaction){
        String current_password = userDao.userPassword(userId).getPassword();
        String old_password = passwordRequest.getOld_password();
        if (new String(old_password).equals(current_password))
        {
            userDao.updateUserPassword(userId, passwordRequest.getNew_password());
            transactionDao.updateUserTransaction(userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
        }
        else{
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Wrong Password");
        }
    }

}
