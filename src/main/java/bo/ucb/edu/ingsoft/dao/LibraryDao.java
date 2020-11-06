package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;

import java.util.List;

public interface LibraryDao {
    //Get User Games
    public List<Game> UserGames(Integer idUser);
}
