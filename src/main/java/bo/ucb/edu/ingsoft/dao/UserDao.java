package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Publisher;
import bo.ucb.edu.ingsoft.models.User;

import java.util.ArrayList;

public interface UserDao {
    //Create new publisher admi;
    public void createUser(User user);

    //Get publisher data
    public User findByUserId(Integer idUser);

    //Update publisher data;
    public void updateUser(User user);

    public ArrayList<User> listUserMails(User user);
}
