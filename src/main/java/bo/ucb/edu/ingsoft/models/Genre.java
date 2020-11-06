package bo.ucb.edu.ingsoft.models;

public class Genre {

    private Integer idGenre;
    private String genre;

    public Genre(Integer idGenre, String genre) {
        this.idGenre = idGenre;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "idGenre=" + idGenre +
                ", genre='" + genre + '\'' +
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
}
