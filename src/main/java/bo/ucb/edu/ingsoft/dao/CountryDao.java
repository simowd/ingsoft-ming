package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Country;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CountryDao {
    //Get a Country Name
     Country CountryName (Integer idCountry);

    //Get a list of countries
     List<Country> CountriesList();
}
