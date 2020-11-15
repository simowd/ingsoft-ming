package bo.ucb.edu.ingsoft.models;

public class GameDirectx extends Transactions {
    private Integer idGameDirectx;
    private Integer idGame;
    private Integer idDirectx;
    private Integer status;

    public GameDirectx() {

    }

    @Override
    public String toString() {
        return "GameDirectx{" +
                "idGameDirectx=" + idGameDirectx +
                ", idGame=" + idGame +
                ", idDirectx=" + idDirectx +
                ", status=" + status +
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}


