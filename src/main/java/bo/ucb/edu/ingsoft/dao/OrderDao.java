package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    // Get Game's sold count
    public Integer gameSells(Game idGame);
    // Get Game's sold count by country
    public List<Integer> gameSellsCountry(@Param("a")Game idGame, @Param("b")User idUser);
    // Get Game's total earnings
    public Double gameEarnings(Game idGame);
    // Get Game's total earnings by month
    public List<Double> gameEarningsMonth(@Param("a") Game idGame, @Param("b")List<Integer> month);
}
