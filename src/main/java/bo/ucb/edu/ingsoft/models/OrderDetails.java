package bo.ucb.edu.ingsoft.models;

import java.util.Date;

public class OrderDetails extends Transactions {
    private Integer idOrderDetails;
    private Integer idGame;
    private Integer idOrder;
    private Double price;
    private Integer status;

    public OrderDetails(Integer idOrderDetails, Integer idGame, Integer idOrder, Double price, Integer status) {
        this.idOrderDetails = idOrderDetails;
        this.idGame = idGame;
        this.idOrder = idOrder;
        this.price = price;
        this.status = status;
    }

    public OrderDetails(Integer txId, String txHost, Integer txUser, Date txDate, Integer idOrderDetails, Integer idGame, Integer idOrder, Double price, Integer status) {
        super(txId, txHost, txUser, txDate);
        this.idOrderDetails = idOrderDetails;
        this.idGame = idGame;
        this.idOrder = idOrder;
        this.price = price;
        this.status = status;
    }

    public OrderDetails() {
    }

    public OrderDetails(Integer txId, String txHost, Integer txUser, Date txDate) {
        super(txId, txHost, txUser, txDate);
    }

    public Integer getIdOrderDetails() {
        return idOrderDetails;
    }

    public void setIdOrderDetails(Integer idOrderDetails) {
        this.idOrderDetails = idOrderDetails;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "idOrderDetails=" + idOrderDetails +
                ", idGame=" + idGame +
                ", idOrder=" + idOrder +
                ", price=" + price +
                ", status=" + status +
                '}';
    }

}
