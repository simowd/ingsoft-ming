package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.PublisherBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.DashboardRequest;
import bo.ucb.edu.ingsoft.dto.NewGameRequest;
import bo.ucb.edu.ingsoft.dto.PublisherRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;
import bo.ucb.edu.ingsoft.models.Developer;
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
            consumes = MediaType.APPLICATION_JSON_VALUE,value = "ming/publisher/{id}/game")
    public NewGameRequest createGame(@PathVariable("id") Integer idPublisher,@RequestBody NewGameRequest newGameRequest, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        NewGameRequest newGameResponse=gameBl.createGame(newGameRequest,transaction,idPublisher);
        return newGameResponse;
    }
}
