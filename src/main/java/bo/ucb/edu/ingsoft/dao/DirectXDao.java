package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DirectXDao {
    //Get a list of directx
    public List<Directx> DirectXList();

}
