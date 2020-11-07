package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.GameOS;
import bo.ucb.edu.ingsoft.models.Genre;
import bo.ucb.edu.ingsoft.models.GenreGame;

import java.util.List;

public interface GenreDao {
    //Get Genre name for User Library
    public List<Genre> genreLibrary (List<Integer> idGame);

    public GenreGame createGenreGame();
}
