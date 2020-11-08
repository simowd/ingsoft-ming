package bo.ucb.edu.ingsoft.dto;

public class PaymentRequest extends GamesRequest {

    private String userEmail;
    private String userName;
    private Long userCard;


    public PaymentRequest() {
    }

    public PaymentRequest(String userEmail, String userName, Long userCard) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userCard = userCard;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserCard() {
        return userCard;
    }

    public void setUserCard(Long userCard) {
        this.userCard = userCard;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", userCard=" + userCard +
                '}';
    }
}
