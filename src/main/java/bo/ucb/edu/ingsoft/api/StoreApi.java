package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.StoreBl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreApi {
    private StoreBl storeBl;

    @Autowired
    public StoreApi(StoreBl storeBl) {
        this.storeBl = storeBl;
    }


}
