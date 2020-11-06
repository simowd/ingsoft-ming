package bo.ucb.edu.ingsoft.models;

import java.sql.Timestamp;

public class Publisher {
    private Integer idPublisher;
    private Integer idUser;
    private String publisher;
    private String paypalMail;
    private Integer status;
    private Integer tx_id;
    private String tx_host;
    private Integer ts_user_id;
    private Timestamp tx_date;

    public Publisher(Integer idPublisher, Integer idUser, String publisher, String paypalMail, Integer status, Integer tx_id, String tx_host, Integer ts_user_id, Timestamp tx_date) {
        this.idPublisher = idPublisher;
        this.idUser = idUser;
        this.publisher = publisher;
        this.paypalMail = paypalMail;
        this.status = status;
        this.tx_id = tx_id;
        this.tx_host = tx_host;
        this.ts_user_id = ts_user_id;
        this.tx_date = tx_date;
    }

    @Override
    public String toString() {
        return "Publishers{" +
                "idPublisher=" + idPublisher +
                ", idUser=" + idUser +
                ", publisher='" + publisher + '\'' +
                ", paypalMail='" + paypalMail + '\'' +
                ", status=" + status +
                ", tx_id=" + tx_id +
                ", tx_host='" + tx_host + '\'' +
                ", ts_user_id=" + ts_user_id +
                ", tx_date=" + tx_date +
                '}';
    }

    public Integer getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Integer idPublisher) {
        this.idPublisher = idPublisher;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPaypalMail() {
        return paypalMail;
    }

    public void setPaypalMail(String paypalMail) {
        this.paypalMail = paypalMail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTx_id() {
        return tx_id;
    }

    public void setTx_id(Integer tx_id) {
        this.tx_id = tx_id;
    }

    public String getTx_host() {
        return tx_host;
    }

    public void setTx_host(String tx_host) {
        this.tx_host = tx_host;
    }

    public Integer getTs_user_id() {
        return ts_user_id;
    }

    public void setTs_user_id(Integer ts_user_id) {
        this.ts_user_id = ts_user_id;
    }

    public Timestamp getTx_date() {
        return tx_date;
    }

    public void setTx_date(Timestamp tx_date) {
        this.tx_date = tx_date;
    }
}
