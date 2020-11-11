package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.StoreBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.server.ResponseStatusException;

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
    @RequestMapping(value = "/ming/store/homepage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomepageRequest> getHomepage(@RequestParam Integer page) {
        return storeBl.getHomePage(page);
    }

    /*
    GET (/store/search?query={pageNumber}) It searches all of the database for the games that contain the specified later
    It's case insensitive
    */
    @RequestMapping(value = "/ming/store/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomepageRequest> getSearch(@RequestParam String query) {
        return storeBl.getSearchData(query);
    }

    /*
    GET (/store/highlights) It gives you all of the currently highlighted games.
    in pages.
    */
    @RequestMapping(value = "/ming/store/highlights", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HighlightRequest> getHighlights() {
        return storeBl.getHighLights();
    }

    @RequestMapping(value = "/ming/store/sale", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SaleRequest> SalePage() {

            List<SaleRequest> sale = storeBl.SalePage();
            return sale;

    }

    /*
    GET (/store/releases) Returns a list of the games that were released during the last 7 days.
    */
    @RequestMapping(value = "/ming/store/releases", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReleaseRequest> getLatestReleases() {
        return storeBl.getLatest();
    }

    /*
    GET (/store/games/{gameId}) Returns all of the important information a game has.
    */
    @RequestMapping(value = "/ming/store/games/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GameDetailsRequest getGameInformation(@PathVariable("id") Integer gameId) {
        return gameBl.getGameInformation(gameId);
    }

    @RequestMapping(value = "/ming/store/single/purchase/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public PaymentRequest getGamePayment(@RequestBody PaymentRequest paymentRequest, HttpServletRequest request) {
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        return storeBl.getGamePayment(paymentRequest, transaction);
    }

}
