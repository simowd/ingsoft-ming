package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.GameDao;
import bo.ucb.edu.ingsoft.dao.PhotoDao;
import bo.ucb.edu.ingsoft.dao.PriceDao;
import bo.ucb.edu.ingsoft.dto.HomepageRequest;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Photo;
import bo.ucb.edu.ingsoft.models.Price;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public List<HomepageRequest> getHomePage(Integer page){
        Integer recordsPerPage = 10;
        Integer offsetValue = (page - 1) * recordsPerPage;
        List<Game> games = gameDao.findPage(recordsPerPage, offsetValue);
        System.out.println(games);
        List<Integer> ids = new ArrayList<Integer>();
        for(Game game : games){
            ids.add(game.getIdGame());
        }
        List<Price> prices = priceDao.findByIdGame(ids);
        List<Photo> photos = photoDao.findBannerbyId(ids);
        List<HomepageRequest> list = new ArrayList<HomepageRequest>();
        for(int i = 0 ; i < games.size() ; i++){
            HomepageRequest homepageRequest = new HomepageRequest(games.get(i).getIdGame().toString(),games.get(i).getName(),prices.get(i).getPrice(),prices.get(i).getSale().doubleValue(),photos.get(i).getPhotoPath());
            list.add(homepageRequest);
        }
        return list;
    }
}
