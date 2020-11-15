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

    /*
       POST (/publisher) The admin create a new publisher
    */
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,value = "/ming/v1/publisher")
    @ResponseStatus(value = HttpStatus.OK)
    public void createPublisher(@RequestBody PublisherRequest publisherRequest, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        publisherBl.createPublisher(publisherRequest, transaction);
    }

    /*
        GET (/publisher) The admin sees a publisher list
    */
    @RequestMapping(value = "/ming/v1/publisher",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PublisherListRequest> publisherList() {
            return publisherBl.getPublisherList();
    }

    /*
        DELETE (/admin/publisher/{id}) The admin delete a publisher account
    */
    @RequestMapping(value = "/ming/admin/publisher/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deletePublisher(@PathVariable("id") Integer userId, HttpServletRequest request) {

            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            publisherBl.deletePublisher(userId,transaction);

    }

    /*
    PUT (/admin/homepage/{gameId}) The selected game changes its highlight status
    */
    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/ming/admin/homepage/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void updatePublisher(@PathVariable("id") Integer gameId, @RequestBody SetHighlightRequest setHighlightRequest, HttpServletRequest request) {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            gameBl.updateHighlight(setHighlightRequest,transaction,gameId);
    }
}
