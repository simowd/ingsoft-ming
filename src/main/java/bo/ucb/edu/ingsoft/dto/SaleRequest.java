package bo.ucb.edu.ingsoft.dto;

import java.sql.Timestamp;
import java.util.Date;

public class SaleRequest {
        private String id;
        private String title;
        private Timestamp releaseDate;
        private Double price;
        private Double sale;
        private String banner;

    public SaleRequest(String title, Timestamp releaseDate, Double price, Double sale, String banner) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.price = price;
        this.sale = sale;
        this.banner = banner;
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

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
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

    @Override
    public String toString() {
        return "SaleRequest{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", price=" + price +
                ", sale=" + sale +
                ", banner='" + banner + '\'' +
                '}';
    }
}
