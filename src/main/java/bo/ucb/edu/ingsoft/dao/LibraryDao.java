package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Library;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LibraryDao {
    //Check User Library games
     Library getLibraryGames(Integer idUser);

    //Get User Games
     List<Integer> UserGames(Integer idUser);
}
