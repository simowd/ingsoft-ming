package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import bo.ucb.edu.ingsoft.models.GameDirectx;
import bo.ucb.edu.ingsoft.models.Language;
import bo.ucb.edu.ingsoft.models.LanguageGame;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesLanguagesDao {

   //Create Game_languages
   public void createLanguageGame(LanguageGame languageGame);

   //Find by id languages
   public List<Language> findByIdLanguage(List<Integer> idLanguage);

   //Find Languages games
   public List <Integer> findGameLanguages(Integer gameId);

   //Find id_Game_languages by ids games
   public List<Integer>  findByIdGamesLanguages(Integer idGame);

   //Delete olds Game_languages
   public void deleteOldsLanguages(List<Integer> idGameLanguages);
}
