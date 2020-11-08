package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.PublisherBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dao.GameDao;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.models.Developer;
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
public class GameApi {
    private GameBl gameBl;
    private TransactionBl transactionBl;


    @Autowired
    public GameApi(GameBl gameBl, TransactionBl transactionBl) {
        this.gameBl = gameBl;
        this.transactionBl = transactionBl;
    }


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE, value = "ming/publisher/{id}/game")
    public NewGameRequest createGame(@PathVariable("id") Integer idPublisher, @RequestBody NewGameRequest newGameRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        NewGameRequest newGameResponse = gameBl.createGame(newGameRequest, transaction, idPublisher);
        return newGameResponse;
    }


    @RequestMapping(value = "/ming/publisher/{id}/game",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updatePublisher(@PathVariable("id") Integer gameId,@RequestBody NewGameRequest newGameRequest, HttpServletRequest request) {
        try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            gameBl.updateGame(newGameRequest,transaction,gameId);
            return "ok";
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @RequestMapping(value = "/ming/publisher/{id}/game",method = RequestMethod.DELETE)
    public @ResponseBody String deleteGame(@PathVariable("id") Integer idGame,  HttpServletRequest request) {
        try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            gameBl.deleteGame(idGame,transaction);
            return "ok";
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }


}
