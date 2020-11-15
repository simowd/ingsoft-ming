package bo.ucb.edu.ingsoft.models;

public class Genre {

    private Integer idGenre;
    private String genre;
    private int status;

    public Genre() {

    }

    public Genre(Integer idGenre, String genre, int status) {
        this.idGenre = idGenre;
        this.genre = genre;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "idGenre=" + idGenre +
                ", genre='" + genre + '\'' +
                ", status=" + status +
                '}';
    }

    public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
