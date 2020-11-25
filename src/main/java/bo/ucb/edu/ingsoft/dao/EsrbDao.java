package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Developer;
import bo.ucb.edu.ingsoft.models.Esrb;
import bo.ucb.edu.ingsoft.models.Genre;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EsrbDao {
    //    get data esrb
    public Esrb findEsrbById(Integer idEsrb);

    //Get a list of esrb
    public List<Esrb> EsrbList();

}
