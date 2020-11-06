package bo.ucb.edu.ingsoft.dto;

public class PublisherListRequest {
    private String publisher;
    private String email;
    private Integer id;

    public PublisherListRequest() {

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PublisherListRequest{" +
                "publisher='" + publisher + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
