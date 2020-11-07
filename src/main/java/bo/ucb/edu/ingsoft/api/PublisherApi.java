package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.PublisherBl;
import bo.ucb.edu.ingsoft.bl.TransactionBl;

import bo.ucb.edu.ingsoft.dto.PublisherRequest;
import bo.ucb.edu.ingsoft.dto.Transaction;

import bo.ucb.edu.ingsoft.util.TransactionUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;

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
}
