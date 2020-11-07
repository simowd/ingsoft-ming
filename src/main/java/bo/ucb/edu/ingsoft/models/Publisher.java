package bo.ucb.edu.ingsoft.models;


import java.util.Date;

public class Publisher extends Transactions {
    private Integer idPublisher;
    private Integer idUser;
    private String publisher;
    private String paypalMail;
    private Integer status;


    public Publisher() {

    }

    public Publisher(Integer idPublisher, Integer idUser, String publisher, String paypalMail, Integer status) {
        this.idPublisher = idPublisher;
        this.idUser = idUser;
        this.publisher = publisher;
        this.paypalMail = paypalMail;
        this.status = status;
    }

    public Publisher(Integer txId, String txHost, Integer txUser, Date txDate, Integer idPublisher, Integer idUser, String publisher, String paypalMail, Integer status) {
        super(txId, txHost, txUser, txDate);
        this.idPublisher = idPublisher;
        this.idUser = idUser;
        this.publisher = publisher;
        this.paypalMail = paypalMail;
        this.status = status;
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

    @Override
    public String toString() {
        return "Publisher{" +
                "idPublisher=" + idPublisher +
                ", idUser=" + idUser +
                ", publisher='" + publisher + '\'' +
                ", paypalMail='" + paypalMail + '\'' +
                ", status=" + status +
                '}';
    }
}