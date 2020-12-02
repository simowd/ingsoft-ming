package bo.ucb.edu.ingsoft.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class gameDashboard {
    private String game;
    private Integer sells;
    private Double earnings;

    public gameDashboard() {
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
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
        return "gameDashboard{" +
                "game='" + game + '\'' +
                ", sells=" + sells +
                ", earnings=" + earnings +
                '}';
    }
}
