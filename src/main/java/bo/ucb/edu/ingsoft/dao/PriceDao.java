package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Contact;
import bo.ucb.edu.ingsoft.dto.SaleRequest;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Price;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PriceDao {
    // Get Price data
    public Price findBySale(Double sale);

}
