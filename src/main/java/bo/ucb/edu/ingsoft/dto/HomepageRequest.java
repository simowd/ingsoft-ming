package bo.ucb.edu.ingsoft.dto;

public class HomepageRequest {
    private String id;
    private String title;
    private Double price;
    private Double sale;
    private String banner;

    public HomepageRequest(String id, String title, Double price, Double sale, String banner) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.sale = sale;
        this.banner = banner;
    }

    public HomepageRequest() {
    }

    @Override
    public String toString() {
        return "HomepageRequest{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", banner='" + banner + '\'' +
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
