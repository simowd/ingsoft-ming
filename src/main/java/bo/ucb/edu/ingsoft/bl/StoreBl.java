package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.GameDao;
import bo.ucb.edu.ingsoft.dao.PhotoDao;
import bo.ucb.edu.ingsoft.dao.PriceDao;
import org.springframework.stereotype.Service;

@Service
public class StoreBl {
    private GameDao gameDao;
    private PriceDao priceDao;
    private PhotoDao photoDao;

    public StoreBl(GameDao gameDao, PriceDao priceDao, PhotoDao photoDao) {
        this.gameDao = gameDao;
        this.priceDao = priceDao;
        this.photoDao = photoDao;
    }
}
