package bo.ucb.edu.ingsoft.dto;

import java.util.List;

public class DashboardRequest {
    private String publisher;
    private String email;
    private String paypal;
    private Integer sells;
    private Double earnings;
    private List<Double> monthly_earnings;
    private List<Integer> country_earnings;
    private List<Integer> game_earnings;

    public DashboardRequest() {
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

    public List<Double> getMonthly_earnings() {
        return monthly_earnings;
    }

    public void setMonthly_earnings(List<Double> monthly_earnings) {
        this.monthly_earnings = monthly_earnings;
    }

    public List<Integer> getCountry_earnings() {
        return country_earnings;
    }

    public void setCountry_earnings(List<Integer> country_earnings) {
        this.country_earnings = country_earnings;
    }

    public List<Integer> getGame_earnings() {
        return game_earnings;
    }

    public void setGame_earnings(List<Integer> game_earnings) {
        this.game_earnings = game_earnings;
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
                ", country_earnings=" + country_earnings +
                ", game_earnings=" + game_earnings +
                '}';
    }
}
