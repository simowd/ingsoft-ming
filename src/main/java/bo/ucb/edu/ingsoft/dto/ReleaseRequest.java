package bo.ucb.edu.ingsoft.dto;


import java.sql.Timestamp;
import java.util.Date;

public class ReleaseRequest {
    private String id;
    private String title;
    private String game_description;
    private Double price;
    private String banner;
    private Timestamp release_date;

    public ReleaseRequest(String id, String title, String game_description, Double price, String banner, Timestamp release_date) {
        this.id = id;
        this.title = title;
        this.game_description = game_description;
        this.price = price;
        this.banner = banner;
        this.release_date = release_date;
    }

    public ReleaseRequest() {
    }

    @Override
    public String toString() {
        return "ReleaseRequest{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", game_description='" + game_description + '\'' +
                ", price=" + price +
                ", banner='" + banner + '\'' +
                ", release_date=" + release_date +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGame_description() {
        return game_description;
    }

    public void setGame_description(String game_description) {
        this.game_description = game_description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public Timestamp getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Timestamp release_date) {
        this.release_date = release_date;
    }
}
