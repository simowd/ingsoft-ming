package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import bo.ucb.edu.ingsoft.models.GameDirectx;
import bo.ucb.edu.ingsoft.models.Language;
import bo.ucb.edu.ingsoft.models.LanguageGame;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesLanguagesDao {

   public void createLanguageGame(LanguageGame languageGame);

   public List<Language> findByIdLanguage(List<Integer> idLanguage);

   public List <Integer> findGameLanguages(Integer gameId);

   public List<Integer>  findByIdGamesLanguages(Integer idGame);

   public void deleteOldsLanguages(List<Integer> idGameLanguages);
}
