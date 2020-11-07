package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Directx;
import bo.ucb.edu.ingsoft.models.GameDirectx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GamesDirectxDao {

   public GameDirectx createGameDirectx();

   public List<Directx> findByIdDirectx(List<Integer> idDirectx);

}
