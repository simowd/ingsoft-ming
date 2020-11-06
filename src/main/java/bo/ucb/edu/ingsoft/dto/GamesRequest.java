package bo.ucb.edu.ingsoft.dto;

public class GamesRequest {
    private Integer id;
    private String title;
    private Double price;
    private Double sale;
    private String banner;
    private boolean highlight;
    private boolean latest;

    public GamesRequest() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public boolean isLatest() {
        return latest;
    }

    public void setLatest(boolean latest) {
        this.latest = latest;
    }

    @Override
    public String toString() {
        return "GamesRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                ", banner='" + banner + '\'' +
                ", highlight=" + highlight +
                ", latest=" + latest +
                '}';
    }
}
