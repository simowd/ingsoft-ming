package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.GameOS;
import bo.ucb.edu.ingsoft.models.Genre;
import bo.ucb.edu.ingsoft.models.GenreGame;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GenreDao {
    //Get Genre name for User Library
    public List<Genre> genreLibrary (List<Integer> idGame);

    public GenreGame createGenreGame();
}
