package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.LoginRequest;
import bo.ucb.edu.ingsoft.dto.LoginUserRequest;
import bo.ucb.edu.ingsoft.models.Publisher;
import bo.ucb.edu.ingsoft.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    //Create new publisher;
    public void createPublisher(User user);

    //Get publisher data
    public User findByUserId(Integer idUser);

    //Update publisher data;
    public void updateUser(User user);

    //Get publisher mail
    public User publisherMail(Integer idUser);

    //Get publisher list (id_user, email)
    public List<User> listUserMails();

    //Create new user
    public void userSignUp(User user);

    //Get User Profile Info
    public User userProfileInfo(Integer idUser);

    //Get User Profile Info for Update
    public User userInfo(Integer idUser);

    //Get User Profile Password for Update
    public User userPassword(Integer idUser);

    //Get Countries ids for a group of users
    public List<Integer> findUsersCountries(List<Integer> idUser);

    //Update User's Info
    public void updateUserInfo(User user);

    //Update User's Password
    public void updateUserPassword(@Param("idUser") Integer idUser, @Param("newPassword") String newPassword);

    //Get last id in user
    public Integer getLastInsertId();

    //Delete user publisher
    public void deleteUserPublisher(Integer idUser);

    //Login user
    public User userFindByLogin(LoginRequest loginRequest);
    public Publisher publisherFindByLogin(LoginRequest loginRequest);

}
