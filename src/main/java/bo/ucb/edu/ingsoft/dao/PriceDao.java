package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Price;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PriceDao {
    // Get Price data
     List<Price> findByIdGame(List<Integer> idGame);

    //Creete Game Price
     void createPrice(Price price);

    //Update Game Price
     void updatePrice(Price price);

    //Find Price by Id game
     Price findById(Integer idGame);

}
