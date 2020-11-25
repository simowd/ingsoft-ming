package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.GameHelper;
import bo.ucb.edu.ingsoft.models.GameRequirementsHelper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface GameDao {
    //Find page for the homepage
     List<Game> findPage(GameHelper gameHelper);

    //Create Game
     void createGame(Game game);

    //Get game info
     Game getGameInfo(Integer idGame);

     ArrayList<Game> getPage(@Param("a") Integer limit, @Param("b") Integer offset);

    //Search Game for User Library
     List<Game> findLibraryGames(List<Integer> idGame);

    //Last Id game
     Integer getLastInsertId();

    //Get publisher developer games
     List<Integer> findGamebyPublisher(List<Integer> idDeveloper);

    //Update game
     void updateGame(Game game);


     Integer findByDeveloperGame(Integer gameId);

    //delete  game
     void deleteGame(Integer idGame);

    //Get a list of the games by a developer
     List<Game> findByPublisher(Integer idPublisher);

    //Get a list of all the games in the database
     List<Game> findAllGames();

    //Get a list of the games with a list of ids.
     List<String> listGameNames(List<Integer> idGame);

    //Update Highlight
     void updateHighlight(Game game);

    //Get publisher id
     Integer getPublisherId(Integer gameId);

    //Get a game Requirements
     List<GameRequirementsHelper> getRequirements(Integer gameId);

}
