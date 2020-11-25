package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenresRequest {
    private Integer idGenre;
    private String genre;

    public GenresRequest() {
    }

    public GenresRequest(Integer idGenre, String genre) {
        this.idGenre = idGenre;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "GenresRequest{" +
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
