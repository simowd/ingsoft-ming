package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.GameDirectx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesDirectxDao {

  //create game_directx
   public void createGameDirectx(GameDirectx gameDirectx);


   public List<Integer>  findByIdDirectxGame(Integer idGame);

   //Delete olds game_directx
   public void deleteOldsDirectx(List<Integer> idGameDirectx);
}