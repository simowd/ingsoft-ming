package bo.ucb.edu.ingsoft.dto;

public class UserRequest {
    private String username;
    private String name;
    private String lastname;
    private String alias;
    private String email;
    private String country;
    private String photo_path;
    private Integer id_country;

    public UserRequest(){
    }

    public UserRequest(String username, String alias, String email, String country, String photo_path) {
        this.username = username;
        this.alias = alias;
        this.email = email;
        this.country = country;
        this.photo_path = photo_path;
    }


    @Override
    public String toString() {
        return "UserRequest{" +
                "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", photo_path='" + photo_path + '\'' +
                ", id_country=" + id_country +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoto_path() {
        return photo_path;
    }

    public void setPhoto_path(String photo_path) {
        this.photo_path = photo_path;
    }

    public Integer getId_country() {
        return id_country;
    }

    public void setId_country(Integer id_country) {
        this.id_country = id_country;
    }
}
