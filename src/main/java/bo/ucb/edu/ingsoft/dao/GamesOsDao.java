package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.GameOS;
import bo.ucb.edu.ingsoft.models.OperatingSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesOsDao {

   public GameOS createGameOs();

   public List<OperatingSystem> findByIdGameOs(List<Integer> idOperatingSystem);


}
