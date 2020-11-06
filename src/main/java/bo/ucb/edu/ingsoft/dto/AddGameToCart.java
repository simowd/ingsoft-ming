package bo.ucb.edu.ingsoft.dto;

public class AddGameToCart extends GameDetailsRequest {
    String user;
    String email;

    public AddGameToCart(String user, String email) {
        this.user = user;
        this.email = email;
    }

    public AddGameToCart(String gender, String type, String operativeSystem, String developer, Integer players, String[] languages, String classification, String description, String processor, String memory, String graphics, String driver, Double storage, Double price, String user, String email) {
        super(gender, type, operativeSystem, developer, players, languages, classification, description, processor, memory, graphics, driver, storage, price);
        this.user = user;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddGameToCart{" +
                "user='" + getUser() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
