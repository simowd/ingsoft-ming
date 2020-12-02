package bo.ucb.edu.ingsoft.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class monthlyDashboard {
    private Integer month;
    private Integer year;
    private Integer sells;
    private Double earnings;

    public monthlyDashboard() {
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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
        return "monthlyDashboard{" +
                "month=" + month +
                ", year=" + year +
                ", sells=" + sells +
                ", earnings=" + earnings +
                '}';
    }
}
