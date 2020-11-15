package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.GameHelper;
import bo.ucb.edu.ingsoft.models.GameRequirements;
import bo.ucb.edu.ingsoft.models.GameRequirementsHelper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GameDao {
    //Find page for the homepage
    public List<Game> findPage(GameHelper gameHelper);

    //Create Game
    public void createGame(Game game);

    //Get game info
    public Game getGameInfo(Integer idGame);

    public ArrayList<Game> getPage(@Param("a") Integer limit, @Param("b") Integer offset);

    //Search Game for User Library
    public List<Game> findLibraryGames(List<Integer> idGame);

    //Last Id game
    public Integer getLastInsertId();

    //Get publisher developer games
    public List<Integer> findGamebyPublisher(List<Integer> idDeveloper);

    //Update game
    public void updateGame(Game game);


    public Integer findByDeveloperGame(Integer gameId);

    //delete  game
    public void deleteGame(Integer idGame);

    //Get a list of the games by a developer
    public List<Game> findByPublisher(Integer idPublisher);

    //Get a list of all the games in the database
    public List<Game> findAllGames();

    //Get a list of the games with a list of ids.
    public List<String> listGameNames(List<Integer> idGame);

    //Update Highlight
    public void updateHighlight(Game game);

    //Get publisher id
    public Integer getPublisherId(Integer gameId);

    //Get a game Requirements
    public List<GameRequirementsHelper> getRequirements(Integer gameId);

}
