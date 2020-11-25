package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Esrb;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EsrbDao {
    //    get data esrb
     Esrb findEsrbById(Integer idEsrb);

    //Get a list of esrb
     List<Esrb> EsrbList();

}
