package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Price;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PriceDao {
    // Get Price data
    public List<Price> findByIdGame(List<Integer> idGame);

    //Creete Game Price
    public void createPrice(Price price);

    //Update Game Price
    public void updatePrice(Price price);

    //Find Price by Id game
    public Price findById(Integer idGame);

}
