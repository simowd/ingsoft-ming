package bo.ucb.edu.ingsoft.dto;

public class PublisherListRequest {
    private Integer idUser;
    private String email;
    private String paypal;
    private String publisher;



    public PublisherListRequest() {
    }

    @Override
    public String toString() {
        return "PublisherListRequest{" +
                "idUser=" + idUser +
                ", email='" + email + '\'' +
                ", paypal='" + paypal + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
