package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.StoreBl;
import bo.ucb.edu.ingsoft.dto.HomepageRequest;
import bo.ucb.edu.ingsoft.dto.SaleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StoreApi {
    private StoreBl storeBl;

    @Autowired
    public StoreApi(StoreBl storeBl) {
        this.storeBl = storeBl;
    }
    @RequestMapping(value="/ming/store/homepage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomepageRequest> getHomepage(@RequestParam Integer page){
        return storeBl.getHomePage(page);
    }

    @RequestMapping(value="/ming/store/sale", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SaleRequest> SalePage(){
        try {
            List<SaleRequest> sale = storeBl.SalePage();
            return sale;
        } catch (Exception ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Page Not Found", ex);
        }

    }

}
