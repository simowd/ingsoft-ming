package bo.ucb.edu.ingsoft.models;

public class Library {
    private Integer idLibrary;
    private Integer idUser;
    private Integer idGame;
    private Integer status;
    private Integer download;

    public Library() {
    }

    public Library(Integer idLibrary, Integer idUser, Integer idGame, Integer status, Integer download) {
        this.idLibrary = idLibrary;
        this.idUser = idUser;
        this.idGame = idGame;
        this.status = status;
        this.download = download;
    }

    @Override
    public String toString() {
        return "Library{" +
                "idLibrary=" + idLibrary +
                ", idUser=" + idUser +
                ", idGame=" + idGame +
                ", status=" + status +
                ", download=" + download +
                '}';
    }

    public Integer getIdLibrary() {
        return idLibrary;
    }

    public void setIdLibrary(Integer idLibrary) {
        this.idLibrary = idLibrary;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDownload() {
        return download;
    }

    public void setDownload(Integer download) {
        this.download = download;
    }
}
