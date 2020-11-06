package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Genre;

import java.util.List;

public interface GenreDao {
    //Get Genre name for User Library
    public List<Genre> GenreLibrary (List<Integer> idGame);
}
