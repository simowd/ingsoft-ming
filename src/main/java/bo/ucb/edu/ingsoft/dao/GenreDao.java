package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Genre;
import bo.ucb.edu.ingsoft.models.GenreGame;
import bo.ucb.edu.ingsoft.models.Language;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GenreDao {
    //Get Genre name for User Library
     List<Genre> genreLibrary (List<Integer> idGame);

    //Create genres in a game
     void createGenreGame(GenreGame genreGame);

    //Get Genre name for one Game
     List<String> gameGenre (Integer idGame);

    //Find name of genre by Id
     List<GenreGame>  findByIdGamesGenre(Integer idGame);

    //Delete genres in a game
     void deleteOldsGenreDao(List<Integer> idGameGenre);

     void changeStatus(Integer idGenreGame);

    //Get a list of genres
     List<Genre> GenresList();

}
