package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.models.monthlyDashboard;

import java.util.List;

public class DashboardRequest {
    private String publisher;
    private String email;
    private String paypal;
    private Integer sells;
    private Double earnings;
    private List<monthlyDashboard> monthlyData;
    private List<String> countries;
    private List<Integer> country_earnings;
    private List<String> games;
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

    public List<monthlyDashboard> getMonthlyData() {
        return monthlyData;
    }

    public void setMonthlyData(List<monthlyDashboard> monthlyData) {
        this.monthlyData = monthlyData;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<Integer> getCountry_earnings() {
        return country_earnings;
    }

    public void setCountry_earnings(List<Integer> country_earnings) {
        this.country_earnings = country_earnings;
    }

    public List<String> getGames() {
        return games;
    }

    public void setGames(List<String> games) {
        this.games = games;
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
                ", monthlyData=" + monthlyData +
                ", countries=" + countries +
                ", country_earnings=" + country_earnings +
                ", games=" + games +
                ", game_earnings=" + game_earnings +
                '}';
    }
}
