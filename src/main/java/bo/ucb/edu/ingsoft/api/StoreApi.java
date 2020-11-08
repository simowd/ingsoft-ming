package bo.ucb.edu.ingsoft.api;

import bo.ucb.edu.ingsoft.bl.GameBl;
import bo.ucb.edu.ingsoft.bl.StoreBl;
import bo.ucb.edu.ingsoft.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class StoreApi {
    private StoreBl storeBl;
    private GameBl gameBl;

    @Autowired
    public StoreApi(StoreBl storeBl, GameBl gameBl) {
        this.storeBl = storeBl;
        this.gameBl = gameBl;
    }

    @RequestMapping(value="/ming/store/homepage", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HomepageRequest> getHomepage(@RequestParam Integer page){
        return storeBl.getHomePage(page);
    }

    @RequestMapping(value="/ming/store/highlights", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<HighlightRequest> getHighlights(){
        return storeBl.getHighLights();
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

    @RequestMapping(value="/ming/store/releases", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReleaseRequest> getLatestReleases(){
        return storeBl.getLatest();
    }

    @RequestMapping(value = "/ming/store/games/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public GameDetailsRequest getGameInfo(@PathVariable("id") Integer gameId){
        return gameBl.getGameInformation(gameId);
    }
}
