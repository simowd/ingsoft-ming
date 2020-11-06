package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Developer;
import bo.ucb.edu.ingsoft.models.Esrb;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EsrbDao {

//    get data esrb
    public Esrb getEsrbInfo(Integer idEsrb);

}
