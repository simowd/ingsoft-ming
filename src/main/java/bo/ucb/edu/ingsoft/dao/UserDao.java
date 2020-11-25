package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    //Create new publisher;
     void createPublisher(User user);

    //Get publisher data
     User findByUserId(Integer idUser);

    //Update publisher data;
     void updateUser(User user);

    //Get publisher mail
     User publisherMail(Integer idUser);

    //Get publisher list (id_user, email)
     List<User> listUserMails();

    //Create new user
     void userSignUp(User user);

    //Get User Profile Info
     User userProfileInfo(Integer idUser);

    //Get User Profile Info for Update
     User userInfo(Integer idUser);

    //Get User Profile Password for Update
     User userPassword(Integer idUser);

    //Get Countries ids for a group of users
     List<Integer> findUsersCountries(List<Integer> idUser);

    //Update User's Info
     void updateUserInfo(User user);

    //Update User's Password
     void updateUserPassword(@Param("idUser") Integer idUser, @Param("newPassword") String newPassword);

    //Get last id in user
     Integer getLastInsertId();

    //Delete user publisher
     void deleteUserPublisher(Integer idUser);

}
