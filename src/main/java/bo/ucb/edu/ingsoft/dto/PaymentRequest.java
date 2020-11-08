package bo.ucb.edu.ingsoft.dto;

public class PaymentRequest extends GamesRequest {

    //    private Integer ;
    private String emailUser;
    private String nameUser;
    private Integer idUser;
//    private Long cardUser;


    public PaymentRequest() {
    }

    public PaymentRequest(String emailUser, String nameUser, Integer idUser) {
        this.emailUser = emailUser;
        this.nameUser = nameUser;
        this.idUser = idUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "emailUser='" + emailUser + '\'' +
                ", nameUser='" + nameUser + '\'' +
                ", idUser=" + idUser +
                '}';
    }
}
