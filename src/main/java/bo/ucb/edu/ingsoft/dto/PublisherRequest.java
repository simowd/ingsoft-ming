package bo.ucb.edu.ingsoft.dto;

public class PublisherRequest {
    private Integer userId;
    private String username;
    private String email;
    private String paypal;
    private String publisher;
    private String country;
    private String password;
    private String repeat_password;

    public PublisherRequest() {
    }

    @Override
    public String toString() {
        return "PublisherRequest{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", paypal='" + paypal + '\'' +
                ", publisher='" + publisher + '\'' +
                ", country='" + country + '\'' +
                ", password='" + password + '\'' +
                ", repeat_password='" + repeat_password + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeat_password() {
        return repeat_password;
    }

    public void setRepeat_password(String repeat_password) {
        this.repeat_password = repeat_password;
    }

}
