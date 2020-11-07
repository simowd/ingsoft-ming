package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Photo;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PhotoDao {
    // Get Photo Data
    public ArrayList<Photo> findByIdGame(ArrayList<Integer> idGame);
    public ArrayList<Photo> findBannerbyId(ArrayList<Integer> idGame);



}
