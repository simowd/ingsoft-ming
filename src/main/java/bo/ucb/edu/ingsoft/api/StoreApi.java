package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.StoreBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StoreApi {
    private StoreBl storeBl;
    private GameBl gameBl;
    private TransactionBl transactionBl;
    private static final Logger LOGGER = LoggerFactory.getLogger(StoreApi.class);

    @Autowired
    public StoreApi(StoreBl storeBl, GameBl gameBl, TransactionBl transactionBl) {
        this.storeBl = storeBl;
        this.gameBl = gameBl;
        this.transactionBl = transactionBl;
    }

    /*
    GET (/store/homepage?page={pageNumber}) It gives you 10 games from the database and orders them
    in pages.
    */
    @RequestMapping(value = "/ming/v1/games", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GamesRequest> getHomepage(@RequestParam Integer page, @RequestParam(required = false) String query, @RequestParam(required = false) Boolean highlight, @RequestParam(required = false) Boolean latest, @RequestParam(required = false) Boolean sale, @RequestParam(required = false) String publisher) {
        return storeBl.getGames(page,query,highlight,latest,sale,publisher);
    }

    /*
    GET (/store/games/{gameId}) Returns all of the important information a game has.
    */
    @RequestMapping(value = "/ming/store/games/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GameDetailsRequest getGameInformation(@PathVariable("id") Integer gameId) {
        return gameBl.getGameInformation(gameId);
    }

    //   /store/single/purchase/ purchase a single game POST
    @RequestMapping(value = "/ming/store/single/purchase/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PaymentRequest getGamePayment(@RequestBody PaymentRequest paymentRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return storeBl.getGamePayment(paymentRequest, transaction);
    }

}
