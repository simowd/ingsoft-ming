package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PhotoDao {
    // Get Photo Data
    public ArrayList<Photo> findByIdGame(ArrayList<Integer> idGame);
    public List<Photo> findBannerbyId(List<Integer> idGame);


    public Photo createPhotoBanner ();
    public Photo createPhoto ();
}
