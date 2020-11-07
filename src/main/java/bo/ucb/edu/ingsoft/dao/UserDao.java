package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Publisher;
import bo.ucb.edu.ingsoft.models.User;
import java.util.List;

public interface UserDao {
    //Create new publisher admi;
    public void createPublisher(User user);

    //Get publisher data
    public User findByUserId(Integer idUser);

    //Update publisher data;
    public void updateUser(User user);

    //Get publisher mail
    public User publisherMail(Publisher idUser);

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

    //Update User's Password
    public User updateUserInfo(Integer idUser);

    //Update User's Password
    public User updateUserPassword(Integer idUser);

}
