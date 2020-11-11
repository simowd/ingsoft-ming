package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.GameOS;
import bo.ucb.edu.ingsoft.models.OperatingSystem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesOsDao {

   //Links a game with operating systems
   public void createGameOs( GameOS gameOS);

   //Gets a list of the operating system and logo using the ids
   public List<OperatingSystem> findByIdGameOs(List<Integer> idOperatingSystem);

   //Gets a list of os ids per game
   public List<Integer> findByGame(Integer gameId);

   //Gets a list of os ids per game
   public List<Integer>  findByIdGamesOs(Integer idGame);

   //Updates OSs for a game.
   public void deleteOldsOs(List<Integer> idGameOs);

}
