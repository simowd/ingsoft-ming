package bo.ucb.edu.ingsoft.models;

import java.sql.Timestamp;
import java.util.Date;

public class Price extends Transactions {
    private Integer idPrice;
    private Integer idGame;
    private Double price;
    private Timestamp date;
    private Double sale;
    private Integer status;

    public Price() {
    }

    public Price(Integer idPrice, Integer idGame, Double price, Timestamp date, Double sale, Integer status) {
        this.idPrice = idPrice;
        this.idGame = idGame;
        this.price = price;
        this.date = date;
        this.sale = sale;
        this.status = status;
    }

    public Price(Integer txId, String txHost, Integer txUser, Date txDate, Integer idPrice, Integer idGame, Double price, Timestamp date, Double sale, Integer status) {
        super(txId, txHost, txUser, txDate);
        this.idPrice = idPrice;
        this.idGame = idGame;
        this.price = price;
        this.date = date;
        this.sale = sale;
        this.status = status;
    }

    public Integer getIdPrice() {
        return idPrice;
    }

    public void setIdPrice(Integer idPrice) {
        this.idPrice = idPrice;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Price{" +
                "idPrice=" + idPrice +
                ", idGame=" + idGame +
                ", price=" + price +
                ", date=" + date +
                ", sale=" + sale +
                ", status=" + status +
                '}';
    }
}
