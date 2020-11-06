package bo.ucb.edu.ingsoft.dto;

import java.sql.Date;

public class ReleaseRequest {
    private String id;
    private String title;
    private String game_description;
    private Double price;
    private String banner;
    private Date release_date;

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

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }
}
