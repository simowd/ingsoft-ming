package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginUserRequest {
    private Integer id_user;
    private Integer id_publisher;
    private Integer user_type;
    private String username;
    private String publisher;
    private String alias;
    private String photo_path;

    @Override
    public String toString() {
        return "LoginUserRequest{" +
                "id_user=" + id_user +
                ", id_publisher=" + id_publisher +
                ", user_type=" + user_type +
                ", username='" + username + '\'' +
                ", publisher='" + publisher + '\'' +
                ", alias='" + alias + '\'' +
                ", photo_path='" + photo_path + '\'' +
                '}';
    }

    public LoginUserRequest() {
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_publisher() {
        return id_publisher;
    }

    public void setId_publisher(Integer id_publisher) {
        this.id_publisher = id_publisher;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }
}
