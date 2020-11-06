package bo.ucb.edu.ingsoft.dto;

import java.util.ArrayList;
import java.util.Objects;

public class AddGameToCart extends GameDetailsRequest {
    String user;
    String email;

    public AddGameToCart(String user, String email) {
        this.user = user;
        this.email = email;
    }

    public AddGameToCart(String gender, String type, String operativeSystem, String developer, Integer players, ArrayList<String> languages, String classification, String description, String processor, String memory, String graphics, String driver, Double storage, Double price, String user, String email) {
        super(gender, type, operativeSystem, developer, players, languages, classification, description, processor, memory, graphics, driver, storage, price);
        this.user = user;
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddGameToCart{" +
                "user='" + user + '\'' +
                ", email='" + email + '\'' +
                '}';
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddGameToCart that = (AddGameToCart) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, email);
    }

}
