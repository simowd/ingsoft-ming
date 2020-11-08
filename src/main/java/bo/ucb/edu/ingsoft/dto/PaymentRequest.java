package bo.ucb.edu.ingsoft.dto;

public class PaymentRequest {

    private Integer idGame;
    private String title;
    private Double price;
    private Integer latest;

    private Integer idUser;
    private String username;
    private String name;
    private String lastname;
    private String alias;
    private String email;
    private String country;
    private String photo_path;
    private Integer id_country;

    public PaymentRequest() {
    }

    public PaymentRequest(Integer idGame, String title, Double price, Integer latest, Integer idUser, String username, String name, String lastname, String alias, String email, String country, String photo_path, Integer id_country) {
        this.idGame = idGame;
        this.title = title;
        this.price = price;
        this.latest = latest;
        this.idUser = idUser;
        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.alias = alias;
        this.email = email;
        this.country = country;
        this.photo_path = photo_path;
        this.id_country = id_country;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
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

    public Integer getLatest() {
        return latest;
    }

    public void setLatest(Integer latest) {
        this.latest = latest;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "idGame=" + idGame +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", latest=" + latest +
                ", idUser=" + idUser +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", alias='" + alias + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", photo_path='" + photo_path + '\'' +
                ", id_country=" + id_country +
                '}';
    }
}
