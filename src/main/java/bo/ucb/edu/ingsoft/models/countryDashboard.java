package bo.ucb.edu.ingsoft.models;

public class countryDashboard {
    private String country;
    private Integer sells;
    private Double earnings;

    public countryDashboard() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    @Override
    public String toString() {
        return "countryDashboard{" +
                "country='" + country + '\'' +
                ", sells=" + sells +
                ", earnings=" + earnings +
                '}';
    }
}
