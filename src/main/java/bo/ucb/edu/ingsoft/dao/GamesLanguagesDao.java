package bo.ucb.edu.ingsoft.dao;


import bo.ucb.edu.ingsoft.models.Language;
import bo.ucb.edu.ingsoft.models.LanguageGame;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesLanguagesDao {

   //Inserts a language into a game.
    void createLanguageGame(LanguageGame languageGame);

   //finds the language name by an id.
    List<Language> findByIdLanguage(List<Integer> idLanguage);

   //Return a list of ids based on a game id
    List <Integer> findGameLanguages(Integer gameId);

   //Return a list of ids based on a game id
    List<LanguageGame>  findByIdGamesLanguages(Integer idGame);

   //Updates languages of a game.
    void deleteOldsLanguages(List<Integer> idGameLanguages);

    void changeStatus(Integer idLanguageGame);
}
