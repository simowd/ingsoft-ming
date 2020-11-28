package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.NewGameRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class GameApi {
    private GameBl gameBl;
    private TransactionBl transactionBl;


    @Autowired
    public GameApi(GameBl gameBl, TransactionBl transactionBl) {
        this.gameBl = gameBl;
        this.transactionBl = transactionBl;
    }

    /*
       POST (/publisher/{id}/game) The publisher create a new game
    */
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE, value = "ming/v1/publisher/{id}/game")
    public void createGame(@PathVariable("id") Integer idPublisher, @RequestBody NewGameRequest newGameRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        gameBl.createGame(newGameRequest, transaction, idPublisher);
    }

    /*
       PUT (/publisher/{id}/game) The publisher can update a game
    */
    @RequestMapping(value = "/ming/v1/publisher/{id}/game", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void updatePublisher(@PathVariable("id") Integer gameId, @RequestBody NewGameRequest newGameRequest, HttpServletRequest request) {

        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        gameBl.updateGame(newGameRequest, transaction, gameId);
    }

    /*
       DELETE (/publisher/{id}/game) The publisher can delete game
    */
    @RequestMapping(value = "/ming/publisher/{id}/game", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteGame(@PathVariable("id") Integer idGame, HttpServletRequest request) {

        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        gameBl.deleteGame(idGame, transaction);
    }


}
