package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import bo.ucb.edu.ingsoft.models.GameDirectx;
import bo.ucb.edu.ingsoft.models.Language;
import bo.ucb.edu.ingsoft.models.LanguageGame;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesLanguagesDao {

   //Inserts a language into a game.
   public void createLanguageGame(LanguageGame languageGame);

   //finds the language name by an id.
   public List<Language> findByIdLanguage(List<Integer> idLanguage);

   //Return a list of ids based on a game id
   public List <Integer> findGameLanguages(Integer gameId);

   //Return a list of ids based on a game id
   public List<Integer>  findByIdGamesLanguages(Integer idGame);

   //Updates languages of a game.
   public void deleteOldsLanguages(List<Integer> idGameLanguages);
}
