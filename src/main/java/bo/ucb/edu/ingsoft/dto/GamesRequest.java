package bo.ucb.edu.ingsoft.dto;

import java.sql.Timestamp;
import java.util.Date;

public class GamesRequest {
    private String id;
    private String title;
    private String description;
    private String developer;
    private Double price;
    private Double sale;
    private String banner;
    private Integer highlight;
    private String release_date;
    private String color;

    public GamesRequest(String id, String title, String description, String developer, Double price, Double sale, String banner, Integer highlight, String release_date, String color) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.developer = developer;
        this.price = price;
        this.sale = sale;
        this.banner = banner;
        this.highlight = highlight;
        this.release_date = release_date;
        this.color = color;
    }

    @Override
    public String toString() {
        return "GamesRequest{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", developer='" + developer + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", banner='" + banner + '\'' +
                ", highlight=" + highlight +
                ", release_date=" + release_date +
                ", color='" + color + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public GamesRequest() {
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

}
