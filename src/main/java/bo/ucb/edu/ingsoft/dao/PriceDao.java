package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.Contact;
import bo.ucb.edu.ingsoft.dto.SaleRequest;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.Price;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface PriceDao {
    // Get Price data
    public List<Price> findByIdGame(List<Integer> idGame);

    public Price createPrice(Integer idGame);

}
