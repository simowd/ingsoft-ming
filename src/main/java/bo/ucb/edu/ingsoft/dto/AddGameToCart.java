package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.models.Esrb;
import bo.ucb.edu.ingsoft.models.OperatingSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AddGameToCart extends GameDetailsRequest {
    String user;
    String email;

    public AddGameToCart(String user, String email) {
        this.user = user;
        this.email = email;
    }


    public AddGameToCart(Integer id, String title, ArrayList<String> language, String game_description, String size, Esrb esrb, List<String> images, String developer, Integer players, Date release_date, String processor, String memory, String graphics, String color, Integer highlighted, String download_path, Integer status, List<OperatingSystem> operating_systems, Double sale) {
        super(id,  title,  language,  game_description,  size, esrb,  images,  developer,  players, release_date,  processor,  memory,  graphics,  color,  highlighted,  download_path,  status,  operating_systems,sale);

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
