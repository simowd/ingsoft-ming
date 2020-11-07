package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.bl.UserBl;
import bo.ucb.edu.ingsoft.dto.PasswordRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.dto.UserRequest;
import bo.ucb.edu.ingsoft.models.User;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

@RestController
public class UserApi {
    private UserBl userBl;
    private TransactionBl transactionBl;

    public UserApi(UserBl userBl, TransactionBl transactionBl) {
        this.userBl = userBl;
        this.transactionBl = transactionBl;
    }

    @RequestMapping(value = "/ming/users/{user}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public UserRequest getUserProfileInfo(@PathVariable("user") Integer userId) {
        try {
            return userBl.userProfileInfo(userId);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    /*@RequestMapping(value = "/ming/users/{user}/password",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updateUserPassword(@PathVariable("user") Integer userId, @RequestBody PasswordRequest passwordRequest, HttpServletRequest request) {

        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        userBl.changeUserPassword(userId, passwordRequest, transaction);
        URI location = "/ming/users/{user}/{password";
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.setLocation(location);
        responseHeaders.set("MyResponseHeader", "MyValue");
        //return new ResponseEntity<String>("Contraseña cambiada", null, HttpStatus.OK);
        return "ok";
    }*/

    @RequestMapping(value = "/ming/users/{user}/password",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updateUserPassword(@PathVariable("user") Integer userId, @RequestBody PasswordRequest passwordRequest, HttpServletRequest request) {
        try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            userBl.changeUserPassword(userId, passwordRequest, transaction);
            return "ok";
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }
}
