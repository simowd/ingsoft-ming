package bo.ucb.edu.ingsoft.bl;

import bo.ucb.edu.ingsoft.dao.GameDao;
import bo.ucb.edu.ingsoft.dao.PhotoDao;
import bo.ucb.edu.ingsoft.dao.PriceDao;
import bo.ucb.edu.ingsoft.dto.HomepageRequest;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Photo;
import bo.ucb.edu.ingsoft.models.Price;
import bo.ucb.edu.ingsoft.dto.SaleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreBl {
    private GameDao gameDao;
    private PriceDao priceDao;
    private PhotoDao photoDao;

    @Autowired
    public StoreBl(GameDao gameDao, PriceDao priceDao, PhotoDao photoDao) {
        this.gameDao = gameDao;
        this.priceDao = priceDao;
        this.photoDao = photoDao;
    }
    public List<HomepageRequest> getHomePage(Integer page) {
        Integer recordsPerPage = 10;
        Integer offsetValue = (page - 1) * recordsPerPage;
        List<Game> games = gameDao.findPage(recordsPerPage, offsetValue);
        List<Integer> ids = new ArrayList<Integer>();
        for (Game game : games) {
            ids.add(game.getIdGame());
        }
        List<Price> prices = priceDao.findByIdGame(ids);
        List<Photo> photos = photoDao.findBannerbyId(ids);
        List<HomepageRequest> list = new ArrayList<HomepageRequest>();
        for (int i = 0; i < games.size(); i++) {
            HomepageRequest homepageRequest = new HomepageRequest(games.get(i).getIdGame().toString(), games.get(i).getName(), prices.get(i).getPrice(), prices.get(i).getSale().doubleValue(), photos.get(i).getPhotoPath());
            list.add(homepageRequest);
        }
        return list;
    }
    public List<SaleRequest> SalePage(){

        List<Game> game=gameDao.findSale();
        List<Integer> gameIds=gameDao.findSaleIds();
        List<Price> price=priceDao.findByIdGame(gameIds);
        List<Photo> photo=photoDao.findBannerbyId(gameIds);

        List<SaleRequest> sale=new ArrayList<>();

        for (int i=0;i<game.size();i++){
            sale.add(new SaleRequest(game.get(i).getName(), game.get(i).getReleaseDate(),price.get(i).getPrice(),price.get(i).getSale(),photo.get(i).getPhotoPath()));
        }
        return sale;
    }
}
