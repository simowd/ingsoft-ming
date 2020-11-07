package bo.ucb.edu.ingsoft.models;


import java.util.Date;

public class Publisher {
    private Integer idPublisher;
    private Integer idUser;
    private String publisher;
    private String paypalMail;
    private Integer status;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;

    public Publisher() {

    }

    @Override
    public String toString() {
        return "Publisher{" +
                "idPublisher=" + idPublisher +
                ", idUser=" + idUser +
                ", publisher='" + publisher + '\'' +
                ", paypalMail='" + paypalMail + '\'' +
                ", status=" + status +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
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

    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }
}