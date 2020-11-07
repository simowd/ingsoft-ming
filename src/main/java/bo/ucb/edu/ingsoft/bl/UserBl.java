package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.*;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBl {
    private UserDao userDao;
    private CountryDao countryDao;
    private TransactionDao transactionDao;
    private GameDao gameDao;
    private LibraryDao libraryDao;
    private GenreDao genreDao;
    private PhotoDao photoDao;

    @Autowired
    public UserBl(UserDao userDao, CountryDao countryDao, TransactionDao transactionDao, GameDao gameDao, LibraryDao libraryDao, GenreDao genreDao, PhotoDao photoDao) {
        this.userDao = userDao;
        this.countryDao = countryDao;
        this.transactionDao = transactionDao;
        this.gameDao = gameDao;
        this.libraryDao = libraryDao;
        this.genreDao = genreDao;
        this.photoDao = photoDao;
    }

    public UserRequest userProfileInfo(Integer idUser){
        User user = userDao.userProfileInfo(idUser);
        Country country = countryDao.CountryName(user.getIdCountry());
        UserRequest userRequest = new UserRequest(user.getUserName(),user.getAlias(),user.getEmail(),country.getName(),user.getPhotoPath());
        return userRequest;
    }


    public void changeUserPassword(Integer userId, PasswordRequest passwordRequest, Transaction transaction){
        String currentPassword = userDao.userPassword(userId).getPassword();
        String oldPassword = passwordRequest.getOld_password();
        if (new String(oldPassword).equals(currentPassword))
        {
            userDao.updateUserPassword(userId, passwordRequest.getNew_password());
            transactionDao.updateUserTransaction(userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
        }
        else{
            throw new ResponseStatusException(
                    HttpStatus.UNAUTHORIZED, "Wrong Password");
        }
    }

    public void updateUserProfileInfo(Integer userId, UserRequest userRequest, Transaction transaction){
        User user = new User();
        user.setIdUser(userId);
        user.setAlias(userRequest.getAlias());
        user.setEmail(userRequest.getEmail());
        user.setIdCountry(userRequest.getId_country());
        user.setPhotoPath(userRequest.getPhoto_path());

        userDao.updateUserInfo(user);
        transactionDao.updateUserTransaction(userId, transaction.getTxId(), transaction.getTxHost(), transaction.getTxUserId(), transaction.getTxDate());
    }

    public List<LibraryRequest> getUserLibrary(Integer userId) {
        List<LibraryRequest> list = new ArrayList<LibraryRequest>();
        List<Integer> userIdGames = libraryDao.UserGames(userId);
        List<Game> gameInfo = gameDao.findLibraryGames(userIdGames);

        List<List<String>> genresList = new ArrayList<List<String>>();
        for (int i = 0; i < userIdGames.size(); i++) {
            List<String> gameGenre = genreDao.gameGenre(userIdGames.get(i));
            genresList.add(gameGenre);
        }
        List<Photo> gameBanner = photoDao.findBannerbyId(userIdGames);

        for (int i = 0; i < userIdGames.size(); i++) {

            LibraryRequest libraryRequest = new LibraryRequest(userIdGames.get(i), gameInfo.get(i).getName(), genresList.get(i),gameBanner.get(i).getPhotoPath(),gameInfo.get(i).getDownloadPath());
            list.add(libraryRequest);
        }
        return list;
    }
}
