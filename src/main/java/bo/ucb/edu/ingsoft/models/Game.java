package bo.ucb.edu.ingsoft.models;

import java.sql.Timestamp;
import java.util.Date;

public class Game extends Transactions {
    private Integer idGame;
    private Integer idEsrb;
    private Integer idDeveloper;
    private String name;
    private String description;
    private String size;
    private Integer players;
    private Timestamp releaseDate;
    private String processor;
    private String memory;
    private String graphics;
    private String color;
    private Integer highlight;
    private String downloadPath;
    private Integer status;

    public Game() {
    }

    public Game(Integer idGame, Integer idEsrb, Integer idDeveloper, String name, String description, String size, Integer players, Timestamp releaseDate, String processor, String memory, String graphics, String color, Integer highlight, String downloadPath, Integer status) {
        this.idGame = idGame;
        this.idEsrb = idEsrb;
        this.idDeveloper = idDeveloper;
        this.name = name;
        this.description = description;
        this.size = size;
        this.players = players;
        this.releaseDate = releaseDate;
        this.processor = processor;
        this.memory = memory;
        this.graphics = graphics;
        this.color = color;
        this.highlight = highlight;
        this.downloadPath = downloadPath;
        this.status = status;
    }

    public Game(Integer txId, String txHost, Integer txUser, Date txDate, Integer idGame, Integer idEsrb, Integer idDeveloper, String name, String description, String size, Integer players, Timestamp releaseDate, String processor, String memory, String graphics, String color, Integer highlight, String downloadPath, Integer status) {
        super(txId, txHost, txUser, txDate);
        this.idGame = idGame;
        this.idEsrb = idEsrb;
        this.idDeveloper = idDeveloper;
        this.name = name;
        this.description = description;
        this.size = size;
        this.players = players;
        this.releaseDate = releaseDate;
        this.processor = processor;
        this.memory = memory;
        this.graphics = graphics;
        this.color = color;
        this.highlight = highlight;
        this.downloadPath = downloadPath;
        this.status = status;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getIdEsrb() {
        return idEsrb;
    }

    public void setIdEsrb(Integer idEsrb) {
        this.idEsrb = idEsrb;
    }

    public Integer getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(Integer idDeveloper) {
        this.idDeveloper = idDeveloper;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
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

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }

    public String getDownloadPath() {
        return downloadPath;
    }

    public void setDownloadPath(String downloadPath) {
        this.downloadPath = downloadPath;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Game{" +
                "idGame=" + idGame +
                ", idEsrb=" + idEsrb +
                ", idDeveloper=" + idDeveloper +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", size='" + size + '\'' +
                ", players=" + players +
                ", releaseDate=" + releaseDate +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphics='" + graphics + '\'' +
                ", color='" + color + '\'' +
                ", highlight=" + highlight +
                ", downloadPath='" + downloadPath + '\'' +
                ", status=" + status +
                '}';
    }
}
