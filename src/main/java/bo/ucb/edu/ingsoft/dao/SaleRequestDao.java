package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Contact;
import bo.ucb.edu.ingsoft.dto.SaleRequest;
import bo.ucb.edu.ingsoft.models.Game;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SaleRequestDao {
    public SaleRequest findById(Game idGame);
}
