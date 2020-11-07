package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {
    // Get Game's sold count
    public List<Integer> gameSells(List<Integer> idGame);
    // Get Game's sold count by Publisher
    public Integer gameSellsPublisher(List<Integer> idGame);
    // Get Game's sold count by Game
    public List<Integer> gameSellsGame(List<Integer> idGame);
    // Get Countries  by games ordered
    public List<Integer> gameOrderCountry(List<Integer> idGame);
    // Get Count Countries  by games ordered
    public List<Integer> gameOrderCountryCount(List<Integer> idGame);
    // Get Game's total earnings by publisher
    public Double gameEarnings(List<Integer> idGame);
    // Get Game's total earnings by month
    public List<Double> gameEarningsMonth(@Param("a") List<Integer> idGame, @Param("b")List<Integer> month);
}
