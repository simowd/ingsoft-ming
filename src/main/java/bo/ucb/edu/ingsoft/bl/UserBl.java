package bo.ucb.edu.ingsoft.bl;


import bo.ucb.edu.ingsoft.dao.CountryDao;
import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.models.Country;
import bo.ucb.edu.ingsoft.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBl {
    private UserDao userDao;
    private CountryDao countryDao;

    @Autowired
    public UserBl(UserDao userDao, CountryDao countryDao) {
        this.userDao = userDao;
        this.countryDao = countryDao;
    }


    public UserRequest userProfileInfo(Integer idUser){
        UserRequest userRequest = new UserRequest();
        User user = userDao.userProfileInfo(idUser);
        Country country = countryDao.CountryName(user.getIdCountry());
        userRequest.setUsername(user.getUserName());
        userRequest.setAlias(user.getAlias());
        userRequest.setEmail(user.getEmail());
        userRequest.setCountry(country.getName());
        userRequest.setPhoto_path(user.getPhotoPath());
        return userRequest;
    }

}
