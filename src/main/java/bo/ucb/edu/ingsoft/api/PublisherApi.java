package bo.ucb.edu.ingsoft.api;

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
public class PublisherApi {
    private PublisherBl publisherBl;
    private TransactionBl transactionBl;

    @Autowired
    public PublisherApi(PublisherBl publisherBl, TransactionBl transactionBl) {
        this.publisherBl = publisherBl;
        this.transactionBl = transactionBl;
    }



    /*
       GET (/publisher/{id}) shows publisher data
    */
    @RequestMapping(value = "/ming/publisher/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PublisherRequest findById (@PathVariable("id") Integer userId) {
            return publisherBl.findByPublisherId(userId);

    }


    /*
        PUT (/publisher/{id}) The publisher can update his account
    */

    @RequestMapping(value = "/ming/publisher/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public  void updatePublisher(@PathVariable("id") Integer userId,@RequestBody PublisherRequest publisherRequest, HttpServletRequest request) {

            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            publisherBl.updatePublisher(publisherRequest,transaction,userId);

    }


    @RequestMapping(value="/ming/publisher/{id}/dashboard", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public DashboardRequest PublisherDashboard(@PathVariable("id") Integer idPublisher){


            return publisherBl.PublisherDashboard(idPublisher);

    }

    /*
    GET (/publisher/{publisherId}/game) Returns all of the games released by a publisher.
    */
    @RequestMapping(value="/ming/publisher/{id}/game", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomepageRequest> getPublisherGames(@PathVariable("id") Integer idPublisher){
        return publisherBl.getAllPublisherGames(idPublisher);
    }
}
