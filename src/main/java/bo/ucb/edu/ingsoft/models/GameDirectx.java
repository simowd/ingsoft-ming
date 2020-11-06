package bo.ucb.edu.ingsoft.models;

public class GameDirectx {
    private Integer idGameDirectx;
    private Integer idGame;
    private Integer idDirectx;

    public GameDirectx(Integer idGameDirectx, Integer idGame, Integer idDirectx) {
        this.idGameDirectx = idGameDirectx;
        this.idGame = idGame;
        this.idDirectx = idDirectx;
    }

    @Override
    public String toString() {
        return "GameDirectx{" +
                "idGameDirectx=" + idGameDirectx +
                ", idGame=" + idGame +
                ", idDirectx=" + idDirectx +
                '}';
    }

    public Integer getIdGameDirectx() {
        return idGameDirectx;
    }

    public void setIdGameDirectx(Integer idGameDirectx) {
        this.idGameDirectx = idGameDirectx;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getIdDirectx() {
        return idDirectx;
    }

    public void setIdDirectx(Integer idDirectx) {
        this.idDirectx = idDirectx;
    }
}


