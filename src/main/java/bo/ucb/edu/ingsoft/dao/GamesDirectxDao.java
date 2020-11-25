package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.GameDirectx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesDirectxDao {

   //inserts the directX id with a game
    void createGameDirectx(GameDirectx gameDirectx);


   //finds the direct x versions used by a game
    List<GameDirectx>  findByIdDirectxGame(Integer idGame);


   //updates directx per game
    void deleteOldsDirectx(List<Integer> idGameDirectx);

    void changeStatus(Integer idGameDirectx);
}