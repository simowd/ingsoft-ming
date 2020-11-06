package bo.ucb.edu.ingsoft.dto;

import java.sql.Date;
import java.util.ArrayList;

public class NewGameRequest {
    private Integer id;
    private String title;
    private ArrayList<String> language;
    private String game_description;
    private String size;
    private String esrb;
    private ArrayList<String> images;
    private String developer;
    private Integer players;
    private Date release_date;
    private String processor;
    private String memory;
    private String graphics;
    private String color;
    private Integer highlighted;
    private String download_path;
    private Integer status;
    private Double sale;

    public NewGameRequest() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getLanguage() {
        return language;
    }

    public void setLanguage(ArrayList<String> language) {
        this.language = language;
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

    public Integer getPlayers() {
        return players;
    }

    public void setPlayers(Integer players) {
        this.players = players;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
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


    @Override
    public String toString() {
        return "CreateGameRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", language=" + language +
                ", game_description='" + game_description + '\'' +
                ", size='" + size + '\'' +
                ", esrb='" + esrb + '\'' +
                ", images=" + images +
                ", developer='" + developer + '\'' +
                ", players=" + players +
                ", release_date=" + release_date +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphics='" + graphics + '\'' +
                ", color='" + color + '\'' +
                ", highlighted=" + highlighted +
                ", download_path='" + download_path + '\'' +
                ", status=" + status +
                ", sale=" + sale +
                '}';
    }
}
