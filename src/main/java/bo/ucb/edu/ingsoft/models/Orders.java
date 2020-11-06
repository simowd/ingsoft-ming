package bo.ucb.edu.ingsoft.models;

import java.sql.Date;

public class Orders extends Transactions {
    private Integer idOrder;
    private Integer idUser;
    private Date date;
    private Integer status;

    public Orders(Integer idOrder, Integer idUser, Date date, Integer status) {
        this.idOrder = idOrder;
        this.idUser = idUser;
        this.date = date;
        this.status = status;
    }

    public Orders(Integer txId, String txHost, Integer txUser, java.util.Date txDate, Integer idOrder, Integer idUser, Date date, Integer status) {
        super(txId, txHost, txUser, txDate);
        this.idOrder = idOrder;
        this.idUser = idUser;
        this.date = date;
        this.status = status;
    }

    public Orders() {
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "idOrder=" + getIdOrder() +
                ", idUser=" + getIdUser() +
                ", date=" + getDate().toString() +
                ", status=" + getStatus() +
                '}';
    }
}
