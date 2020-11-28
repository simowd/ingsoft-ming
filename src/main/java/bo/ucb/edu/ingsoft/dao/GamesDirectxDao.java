package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.GameDirectx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesDirectxDao {

    //inserts the directX id with a game
    public void createGameDirectx(GameDirectx gameDirectx);


    //finds the direct x versions used by a game
    public List<GameDirectx> findByIdDirectxGame(Integer idGame);


    //updates directx per game
    public void deleteOldsDirectx(List<Integer> idGameDirectx);

    public void changeStatus(Integer idGameDirectx);
}