package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.GameOS;
import bo.ucb.edu.ingsoft.models.OperatingSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesOsDao {

   //Create ame_os
   public void createGameOs( GameOS gameOS);

   public List<OperatingSystem> findByIdGameOs(List<Integer> idOperatingSystem);

   public List<Integer> findByGame(Integer gameId);

   public List<Integer>  findByIdGamesOs(Integer idGame);

   //Delete olds OS
   public void deleteOldsOs(List<Integer> idGameOs);

}
