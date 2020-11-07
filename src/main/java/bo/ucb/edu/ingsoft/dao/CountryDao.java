package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Country;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CountryDao {

    public Country CountryName (Integer idCountry);
}
