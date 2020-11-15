package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Library;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LibraryDao {
    //Check User Library games
    public Library getLibraryGames(Integer idUser);

    //Get User Games
    public List<Integer> UserGames(Integer idUser);
}
