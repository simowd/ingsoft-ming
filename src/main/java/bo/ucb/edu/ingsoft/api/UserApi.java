package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.StoreBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.util.TransactionUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserApi {
    private UserBl userBl;
    private TransactionBl transactionBl;
    private StoreBl storeBl;

    @Autowired
    public UserApi(UserBl userBl, TransactionBl transactionBl, StoreBl storeBl) {
        this.userBl = userBl;
        this.transactionBl = transactionBl;
        this.storeBl = storeBl;
    }

    /*
    POST (/users/signup) The user creates an account
    */
    @RequestMapping(value = "/ming/v1/users/signup", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public UserRequest userSignUp(@RequestBody UserRequest userRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return userBl.userSignUp(userRequest, transaction);
    }

    /*
    GET (/users/{id}) The user sees his profile info
    */
    @RequestMapping(value = "/ming/v1/users/{user}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRequest getUserProfileInfo(@PathVariable("user") Integer userId) {
        return userBl.userProfileInfo(userId);
    }

    /*
    PUT (/users/{id}) The user can edit his profile info
    */
    @RequestMapping(value = "/ming/v1/users/{user}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateUserInfo(@PathVariable("user") Integer userId, @RequestBody UserRequest userRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        userBl.updateUserProfileInfo(userId, userRequest, transaction);
    }

    /*
    PUT (/users/{id}/password) The user can edit his password
    */
    @RequestMapping(value = "/ming/v1/users/{user}/password", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void updateUserPassword(@PathVariable("user") Integer userId, @RequestBody PasswordRequest passwordRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        userBl.changeUserPassword(userId, passwordRequest, transaction);
    }


    /*
    GET (/users/{id}/library) The user sees his game library
    */
    @RequestMapping(value = "ming/v1/users/{user}/library", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LibraryRequest> getUserLibrary(@PathVariable("user") Integer userId) {
        return userBl.getUserLibrary(userId);
    }

    /*
    GET (/countries) The user sees a combobox with countries ids and names.
    */
    @RequestMapping(value = "ming/v1/countries", method = RequestMethod.GET)
    public List<CountryRequest> getCountries() {
        return userBl.getCountries();
    }


    //    /users/{id}/cart show user's cart GET
    @RequestMapping(value = "/ming/users/{id}/cart", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GameDetailsRequest> getCart(@PathVariable("id") Integer userId) {
        return userBl.getCartByUser(userId);
    }

    //    /users/{id}/cart add a game to his cart POST
    @RequestMapping(value = "/ming/{users}/{id}/cart", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GameDetailsRequest addGameToCart(@PathVariable("users") Integer userId, @PathVariable("id") Integer gameId, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return userBl.addGameToCart(userId, gameId, transaction);
    }

    //    /users/{id}/cart delete a game to his cart DELETE
    @RequestMapping(value = "/ming/{users}/{id}/cart", method = RequestMethod.DELETE)
    public void deleteGameFromCart(@PathVariable("users") Integer userId, @PathVariable("id") Integer gameId, HttpServletRequest request) {
        try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            userBl.deleteGameFromCart(userId, gameId);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Cart Not Found", ex);
        }
    }

    //   /users/{id}/cart/purchase the user buy games from cart POST
    @RequestMapping(value = "/ming/users/{id}/cart/purchase", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Game> purchaseGamesFromCart(@PathVariable("id") Integer userId, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return userBl.purchaseGamesCart(userId, transaction);
    }
}
