package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LibraryDao {
    //Get User Games
    public List<Game> UserGames(Integer idUser);
}
