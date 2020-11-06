package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Photo;
import bo.ucb.edu.ingsoft.models.Price;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface PhotoDao {
    // Get Photo Data
    public ArrayList<Photo> findByIdGame(ArrayList<Integer> idGame);

}
