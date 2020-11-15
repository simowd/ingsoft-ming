package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Timestamp;
import java.util.Date;
import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NewGameRequest {
    private Integer id;
    private Integer idEsrb;
    private String title;
    private String game_description;
    private String size;
    private Integer players;
    private Timestamp release_date;
    private String processor;
    private String memory;
    private String graphics;
    private String color;
    private Integer highlighted;
    private String download_path;
    private ArrayList<String> language;
    private ArrayList<String> images;
    private String esrb;
    private String developer;
    private ArrayList<Integer> directx;
    private ArrayList<Integer> operatingSystem;
    private ArrayList<Integer> languageGames;
    private ArrayList<Integer> genreGames;
    private Integer status;
    private Double sale;
    private Double price;

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
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphics='" + graphics + '\'' +
                ", color='" + color + '\'' +
                ", highlighted=" + highlighted +
                ", download_path='" + download_path + '\'' +
                ", language=" + language +
                ", images=" + images +
                ", esrb='" + esrb + '\'' +
                ", developer='" + developer + '\'' +
                ", directx=" + directx +
                ", operatingSystem=" + operatingSystem +
                ", languageGames=" + languageGames +
                ", genreGames=" + genreGames +
                ", status=" + status +
                ", sale=" + sale +
                ", price=" + price +
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

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
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

    public String getEsrb() {
        return esrb;
    }

    public void setEsrb(String esrb) {
        this.esrb = esrb;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public ArrayList<Integer> getDirectx() {
        return directx;
    }

    public void setDirectx(ArrayList<Integer> directx) {
        this.directx = directx;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getSale() {
        return sale;
    }

    public void setSale(Double sale) {
        this.sale = sale;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
