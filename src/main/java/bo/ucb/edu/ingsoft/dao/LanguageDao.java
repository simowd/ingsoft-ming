package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Language;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LanguageDao {
    //Get a list of languages
     List<Language> LanguagesList();
}
