package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.GameDetailsRequest;
import bo.ucb.edu.ingsoft.models.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDao {
    // Get Game's sold count
     List<Integer> gameSells(List<Integer> idGame);

    // Get Game's sold count by Publisher
     Integer gameSellsPublisher(List<Integer> idGame);

    // Get Game's sold count by Game
     List<gameDashboard> gameSellsGame(List<Integer> idGame);

    // Get Countries  by games ordered
     List<Integer> gameOrderCountry(List<Integer> idGame);

    // Get Count Countries  by games ordered
     List<countryDashboard> gameOrderCountryCount(@Param("a") List<Integer> idGame, @Param("b") List<Integer> idCountry);

    // Get Game's total earnings by publisher
     Double gameEarnings(List<Integer> idGame);

    // Get Game's total earnings by month
     List<monthlyDashboard> gameEarningsMonth(@Param("a") List<Integer> idGame, @Param("b") List<Integer> month);

    //Last Id game
     Integer getLastInsertId();

    // Create order
     void createOrder(Orders orders);

    // Create relation between orders and game
     void createOrderDetails(OrderDetails orderDetails);

    // Get orders with status 0
     List<Orders> getOrdersUser(Integer userIdCart);

    // Get orders by user
     List<GameDetailsRequest> getCartUser(Integer userIdCart);

    // Update status order with user an order id
     void updateOrder(Integer statusUpdate, Integer idOrder);

    // Returns id_order by game and user
     List<Integer> getOrderDetailGameByUser(Integer gameId, Integer userId);

    // Returns id orders by user
     List<Integer> getOrderDetailByUser(Integer userId);

}
