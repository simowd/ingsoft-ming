package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GameDao {
    // Get Sale games data
    public List<Game> findSale();

    //Find page for the homepage
    public ArrayList<Game> findPage(@Param("a") Integer limit, @Param("b") Integer offset);

    //Gets all the highlights for the projects
    public List<Game> findHighlight();

    //Find latest releases (last week)
    public List<Game> findLatestReleases();

    //Create Game
    public Game createGame(Game game);
    public Game getGameInfo(Integer idGame);

    public ArrayList<Game> getPage(@Param("a") Integer limit, @Param("b") Integer offset);

    //Search Game for User Library
    public List<Game> findLibraryGames(List<Integer> idGame);

    //Last Id game
    public Integer getLastInsertId();

    //Get publisher developer games
    public List<Game> findGamebyPublisher(List<Integer> idDeveloper);
}
