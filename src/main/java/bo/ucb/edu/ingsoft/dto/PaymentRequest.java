package bo.ucb.edu.ingsoft.dto;

public class PaymentRequest extends GamesRequest {

    private String email;
    private String user;
    private Long card;
//    private GamesModel[] games;


    public PaymentRequest() {
    }

    public PaymentRequest(String email, String user, Long card) {
        this.email = email;
        this.user = user;
        this.card = card;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "email='" + email + '\'' +
                ", user='" + user + '\'' +
                ", card=" + card +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Long getCard() {
        return card;
    }

    public void setCard(Long card) {
        this.card = card;
    }
}
