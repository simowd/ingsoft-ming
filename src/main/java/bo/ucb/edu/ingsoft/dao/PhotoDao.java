package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PhotoDao {
    // Get Photo Data
    public List<Photo> findByIdGame(List<Integer> idGame);
    public List<Photo> findBannerbyId(List<Integer> idGame);
    public List<Photo> findPhotosByGameId(Integer idGame);


    public void createPhotoBanner (Photo photo);
    public void createPhoto (Photo photo);

}
