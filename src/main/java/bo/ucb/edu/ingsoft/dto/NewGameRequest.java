package bo.ucb.edu.ingsoft.dto;

import bo.ucb.edu.ingsoft.models.GameRequirements;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewGameRequest {
    private Integer id;
    private Integer idEsrb;
    private String title;
    private String game_description;
    private String size;
    private Integer players;
    private Timestamp release_date;
    private List<GameRequirements> requirements;
    private String color;
    private Integer highlighted;
    private String download_path;
    private ArrayList<String> language;
    private ArrayList<String> images;
    private ArrayList<Integer> directx;
    private ArrayList<Integer> operatingSystem;
    private ArrayList<Integer> languageGames;
    private ArrayList<Integer> genreGames;
    private Double sale;
    private Double price;
    private String developer;

    public NewGameRequest() {

    }

    @Override
    public String toString() {
        return "NewGameRequest{" +
                "id=" + id +
                ", idEsrb=" + idEsrb +
                ", title='" + title + '\'' +
                ", game_description='" + game_description + '\'' +
                ", size='" + size + '\'' +
                ", players=" + players +
                ", release_date=" + release_date +
                ", requirements=" + requirements +
                ", color='" + color + '\'' +
                ", highlighted=" + highlighted +
                ", download_path='" + download_path + '\'' +
                ", language=" + language +
                ", images=" + images +
                ", directx=" + directx +
                ", operatingSystem=" + operatingSystem +
                ", languageGames=" + languageGames +
                ", genreGames=" + genreGames +
                ", sale=" + sale +
                ", price=" + price +
                ", developer='" + developer + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdEsrb() {
        return idEsrb;
    }

    public void setIdEsrb(Integer idEsrb) {
        this.idEsrb = idEsrb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGame_description() {
        return game_description;
    }

    public void setGame_description(String game_description) {
        this.game_description = game_description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getPlayers() {
        return players;
    }

    public void setPlayers(Integer players) {
        this.players = players;
    }

    public Timestamp getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Timestamp release_date) {
        this.release_date = release_date;
    }

    public List<GameRequirements> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<GameRequirements> requirements) {
        this.requirements = requirements;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHighlighted() {
        return highlighted;
    }

    public void setHighlighted(Integer highlighted) {
        this.highlighted = highlighted;
    }

    public String getDownload_path() {
        return download_path;
    }

    public void setDownload_path(String download_path) {
        this.download_path = download_path;
    }

    public ArrayList<String> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public ArrayList<Integer> getDirectx() {
        return directx;
    }

    public void setDirectx(ArrayList<Integer> directx) {
        this.directx = directx;
    }

    public ArrayList<Integer> getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(ArrayList<Integer> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ArrayList<Integer> getLanguageGames() {
        return languageGames;
    }

    public void setLanguageGames(ArrayList<Integer> languageGames) {
        this.languageGames = languageGames;
    }

    public ArrayList<Integer> getGenreGames() {
        return genreGames;
    }

    public void setGenreGames(ArrayList<Integer> genreGames) {
        this.genreGames = genreGames;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
