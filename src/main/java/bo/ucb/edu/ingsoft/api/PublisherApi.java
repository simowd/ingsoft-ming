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


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,value = "/ming/admin/publisher")

    public PublisherRequest createPublisher(@RequestBody PublisherRequest publisherRequest, HttpServletRequest request){
        Transaction transaction = TransactionUtil.createTransaction(request);
        transactionBl.createTransaction(transaction);
        PublisherRequest publisherResponse = publisherBl.createPublisher(publisherRequest, transaction);
        return publisherResponse;
    }

    @RequestMapping(value = "/ming/publisher/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public PublisherRequest findById (@PathVariable("id") Integer userId) {
        try {
            return publisherBl.findByPublisherId(userId);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
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
    public @ResponseBody String deletePublisher(@PathVariable("id") Integer userId,  HttpServletRequest request) {
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

    @RequestMapping(value = "/ming/publisher/{id}",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String updatePublisher(@PathVariable("id") Integer userId,@RequestBody PublisherRequest publisherRequest, HttpServletRequest request) {
        try {
            Transaction transaction = TransactionUtil.createTransaction(request);
            transactionBl.createTransaction(transaction);
            publisherBl.updatePublisher(publisherRequest,transaction,userId);
            return "ok";
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "User Not Found", ex);
        }
    }

    @RequestMapping(value="/ming/publisher/{id}/dashboard", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public DashboardRequest PublisherDashboard(@PathVariable("id") Integer idPublisher){
        try {
            return publisherBl.PublisherDashboard(idPublisher);
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Page Not Found", ex);
        }

    }

    @RequestMapping(value="/ming/publisher/{id}/game", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomepageRequest> getPublisherGames(@PathVariable("id") Integer idPublisher){
        return publisherBl.getAllPublisherGames(idPublisher);
    }
}
