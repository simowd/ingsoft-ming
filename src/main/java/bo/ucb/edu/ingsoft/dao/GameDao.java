package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.SaleRequest;
import bo.ucb.edu.ingsoft.models.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface GameDao {
    // Get Sale games data
    public Game findById(ArrayList<Integer> idGame);
}
