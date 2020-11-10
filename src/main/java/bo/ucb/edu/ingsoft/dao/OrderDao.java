package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.GameDetailsRequest;
import bo.ucb.edu.ingsoft.models.Game;
import bo.ucb.edu.ingsoft.models.OrderDetails;
import bo.ucb.edu.ingsoft.models.Orders;
import bo.ucb.edu.ingsoft.models.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
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
    public List<Double> gameEarningsMonth(@Param("a") List<Integer> idGame, @Param("b") List<Integer> month);

    //Last Id game
    public Integer getLastInsertId();

    // Create order
    public void createOrder(Orders orders);

    // Create relation between orders and game
    public void createOrderDetails(OrderDetails orderDetails);

    // Get orders with status 0
    public List<Orders> getOrdersUser(Integer userIdCart);

    // Get orders by user
    public List<GameDetailsRequest> getCartUser(Integer userIdCart);

    // Update status order with user an order id
    public void updateOrder(Integer statusUpdate, Integer idOrder);

    public List<Integer> getOrderDetailGameByUser(Integer gameId, Integer userId);

}
