package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.User;
import java.util.List;

public interface UserDao {
    //Create new publisher admi;
    public void createPublisher(User user);

    //Get publisher data
    public User findByUserId(Integer idUser);

    //Update publisher data;
    public void updateUser(User user);

    //Get publisher list (id_user, email)
    public List<User> listUserMails();

    //Create new user
    public void UserSignUp(User user);

    //Get User Profile Info
    public User UserProfileInfo(Integer idUser);

}
