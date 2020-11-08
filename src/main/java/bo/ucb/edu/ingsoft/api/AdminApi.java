package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.PublisherBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;
import bo.ucb.edu.ingsoft.dto.*;
import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class AdminApi {
    private PublisherBl publisherBl;
    private TransactionBl transactionBl;
    private GameBl gameBl;

    @Autowired
    public AdminApi(PublisherBl publisherBl, TransactionBl transactionBl, GameBl gameBl) {
        this.publisherBl = publisherBl;
        this.transactionBl = transactionBl;
        this.gameBl = gameBl;
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,value = "/ming/admin/publisher")

    public PublisherRequest createPublisher(@RequestBody PublisherRequest publisherRequest, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        PublisherRequest publisherResponse = publisherBl.createPublisher(publisherRequest, transaction);
        return publisherResponse;
    }

    @RequestMapping(value = "/ming/admin/publisher",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PublisherRequest> publisherList() {
        try {
            return publisherBl.getPublisherList();
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @RequestMapping(value = "/ming/admin/publisher/{id}",method = RequestMethod.DELETE)
    public @ResponseBody
    String deletePublisher(@PathVariable("id") Integer userId, HttpServletRequest request) {
        try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            publisherBl.deletePublisher(userId,transaction);
            return "ok";
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @RequestMapping(value="/ming/publisher/games", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<GameAdminRequest> getAdminGames(){
        return publisherBl.getAllGames();
    }

    @RequestMapping(value = "/ming/admin/homepage/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updatePublisher(@PathVariable("id") Integer gameId, @RequestBody SetHighlightRequest setHighlightRequest, HttpServletRequest request) {
        //try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            gameBl.updateHighlight(setHighlightRequest,transaction,gameId);
            return "ok";
//        } catch (Exception ex) {
//            throw new ResponseStatusException(
//                    HttpStatus.NOT_FOUND, "Game Not Found", ex);
//        }
    }
}
