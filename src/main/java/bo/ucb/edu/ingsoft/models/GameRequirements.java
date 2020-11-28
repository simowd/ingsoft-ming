package bo.ucb.edu.ingsoft.models;

import java.util.Date;

public class GameRequirements extends Transactions {
    private Integer idGameRequirement;
    private Integer idGame;
    private Integer idOperatingSystem;
    private String processor;
    private String memory;
    private String graphics;
    private Integer status;

    @Override
    public String toString() {
        return "GameRequirements{" +
                "idGameRequirement=" + idGameRequirement +
                ", idGame=" + idGame +
                ", idOperatingSystem=" + idOperatingSystem +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphics='" + graphics + '\'' +
                ", status=" + status +
                '}';
    }

    public GameRequirements() {
    }

    public GameRequirements(Integer txId, String txHost, Integer txUser, Date txDate, Integer idGameRequirement, Integer idGame, Integer idOperatingSystem, String processor, String memory, String graphics, Integer status) {
        super(txId, txHost, txUser, txDate);
        this.idGameRequirement = idGameRequirement;
        this.idGame = idGame;
        this.idOperatingSystem = idOperatingSystem;
        this.processor = processor;
        this.memory = memory;
        this.graphics = graphics;
        this.status = status;
    }

    public Integer getIdGameRequirement() {
        return idGameRequirement;
    }

    public void setIdGameRequirement(Integer idGameRequirement) {
        this.idGameRequirement = idGameRequirement;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getIdOperatingSystem() {
        return idOperatingSystem;
    }

    public void setIdOperatingSystem(Integer idOperatingSystem) {
        this.idOperatingSystem = idOperatingSystem;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
