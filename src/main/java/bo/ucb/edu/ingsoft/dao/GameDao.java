package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.SaleRequest;
import bo.ucb.edu.ingsoft.models.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GameDao {
    // Get Sale games data
    public List<Game> findSale();
}
