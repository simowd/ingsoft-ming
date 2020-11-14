package bo.ucb.edu.ingsoft.models;

public class GameHelper {
    private Integer limit;
    private Integer offset;
    private String query;
    private Boolean highlight;
    private Boolean latest;
    private Boolean sale;
    private String publisher;

    public GameHelper(Integer limit, Integer offset, String query, Boolean highlight, Boolean latest, Boolean sale, String publisher) {
        this.limit = limit;
        this.offset = offset;
        this.query = query;
        this.highlight = highlight;
        this.latest = latest;
        this.sale = sale;
        this.publisher = publisher;
    }

    public GameHelper() {

    }

    @Override
    public String toString() {
        return "GameHelper{" +
                "limit=" + limit +
                ", offset=" + offset +
                ", query='" + query + '\'' +
                ", highlight=" + highlight +
                ", latest=" + latest +
                ", sale=" + sale +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public Boolean getLatest() {
        return latest;
    }

    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    public Boolean getSale() {
        return sale;
    }

    public void setSale(Boolean sale) {
        this.sale = sale;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
