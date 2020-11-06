package bo.ucb.edu.ingsoft.dto;

public class PaymentRequest extends UserRequest {

    private String email;
    private Long card;
//    private GamesModel[] games;


    public PaymentRequest(String email, Long card) {
        this.email = email;
        this.card = card;
    }

    public PaymentRequest() {
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "email='" + email + '\'' +
                ", card=" + card +
                '}';
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getCard() {
        return card;
    }

    public void setCard(Long card) {
        this.card = card;
    }
}
