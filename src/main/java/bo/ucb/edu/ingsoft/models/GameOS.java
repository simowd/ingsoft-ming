package bo.ucb.edu.ingsoft.models;

public class GameOS {
    private Integer idGameOs;
    private Integer idGame;
    private Integer idOperatingSystem;

    public GameOS() {
    }

    @Override
    public String toString() {
        return "GameOS{" +
                "idGameOs=" + idGameOs +
                ", idGame=" + idGame +
                ", idOperatingSystem=" + idOperatingSystem +
                '}';
    }

    public Integer getIdGameOs() {
        return idGameOs;
    }

    public void setIdGameOs(Integer idGameOs) {
        this.idGameOs = idGameOs;
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
}
