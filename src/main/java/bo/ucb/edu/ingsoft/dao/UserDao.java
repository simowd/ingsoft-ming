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

<<<<<<< HEAD
    //Get publisher list (id_user, email)
    public List<User> listUserMails();
=======
    public ArrayList<User> listUserMails(User user);

    //Create new user
    public void UserSignUp(User user);
>>>>>>> 0de2fa6b4b830b64841a5f1ee6cc7d3836f3457a
}
