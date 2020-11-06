package bo.ucb.edu.ingsoft.dto;

public class DashboardRequest {
    private String publisher;
    private String email;
    private String paypal;
    private Integer sells;
    private Double earnings;
    private Double monthly_earnings;
    private String country;
    private String game;

    public DashboardRequest() {
    }

    @Override
    public String toString() {
        return "DashboardRequest{" +
                "publisher='" + publisher + '\'' +
                ", email='" + email + '\'' +
                ", paypal='" + paypal + '\'' +
                ", sells=" + sells +
                ", earnings=" + earnings +
                ", monthly_earnings=" + monthly_earnings +
                ", country='" + country + '\'' +
                ", game='" + game + '\'' +
                '}';
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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

    public Integer getSells() {
        return sells;
    }

    public void setSells(Integer sells) {
        this.sells = sells;
    }

    public Double getEarnings() {
        return earnings;
    }

    public void setEarnings(Double earnings) {
        this.earnings = earnings;
    }

    public Double getMonthly_earnings() {
        return monthly_earnings;
    }

    public void setMonthly_earnings(Double monthly_earnings) {
        this.monthly_earnings = monthly_earnings;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

}
