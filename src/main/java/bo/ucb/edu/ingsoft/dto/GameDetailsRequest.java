package bo.ucb.edu.ingsoft.dto;

import java.util.ArrayList;

public class GameDetailsRequest {
    private String gender;
    private String type;
    private String operativeSystem;
    private String developer;
    private Integer players;
    private ArrayList<String> languages;
    private String classification;
    private String description;
    private String processor;
    private String memory;
    private String graphics;
    private String driver;
    private Double storage;
    private Double price;

    public GameDetailsRequest() {
    }

    public GameDetailsRequest(String gender, String type, String operativeSystem, String developer, Integer players, ArrayList<String> languages, String classification, String description, String processor, String memory, String graphics, String driver, Double storage, Double price) {
        this.gender = gender;
        this.type = type;
        this.operativeSystem = operativeSystem;
        this.developer = developer;
        this.players = players;
        this.languages = languages;
        this.classification = classification;
        this.description = description;
        this.processor = processor;
        this.memory = memory;
        this.graphics = graphics;
        this.driver = driver;
        this.storage = storage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GameDetailsRequest{" +
                "gender='" + gender + '\'' +
                ", type='" + type + '\'' +
                ", operativeSystem='" + operativeSystem + '\'' +
                ", developer='" + developer + '\'' +
                ", players=" + players +
                ", languages=" + languages +
                ", classification='" + classification + '\'' +
                ", description='" + description + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphics='" + graphics + '\'' +
                ", driver='" + driver + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperativeSystem() {
        return operativeSystem;
    }

    public void setOperativeSystem(String operativeSystem) {
        this.operativeSystem = operativeSystem;
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

    public ArrayList<String> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Double getStorage() {
        return storage;
    }

    public void setStorage(Double storage) {
        this.storage = storage;
    }
}
