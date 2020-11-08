package bo.ucb.edu.ingsoft.dto;

public class GameAdminRequest {
    private String id;
    private String title;
    private Double price;
    private Double sale;
    private String banner;
    private Integer highlight;

    public GameAdminRequest() {
    }

    public GameAdminRequest(String id, String title, Double price, Double sale, String banner, Integer highlight) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.sale = sale;
        this.banner = banner;
        this.highlight = highlight;
    }

    @Override
    public String toString() {
        return "GameAdminRequest{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", banner='" + banner + '\'' +
                ", highlight=" + highlight +
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

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }
}
