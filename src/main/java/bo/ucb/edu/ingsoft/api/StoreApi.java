package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.StoreBl;
import bo.ucb.edu.ingsoft.dto.HomepageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class StoreApi {
    private StoreBl storeBl;

    @Autowired
    public StoreApi(StoreBl storeBl) {
        this.storeBl = storeBl;
    }
    @RequestMapping(value="/ming/store/homepage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getHomepage(@RequestParam Integer page){
        return "ID" + page;
    }

}
