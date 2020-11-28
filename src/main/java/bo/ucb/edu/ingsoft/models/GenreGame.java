package bo.ucb.edu.ingsoft.models;

public class GenreGame extends Transactions {

    private Integer idGenreGame;
    private Integer idGame;
    private Integer idGenre;

    public GenreGame(Integer idGenreGame, Integer idGame, Integer idGenre) {
        this.idGenreGame = idGenreGame;
        this.idGame = idGame;
        this.idGenre = idGenre;
    }

    public GenreGame() {

    }

    @Override
    public String toString() {
        return "Genres_Games{" +
                "idGenreGame=" + idGenreGame +
                ", idGame=" + idGame +
                ", idGenre=" + idGenre +
                '}';
    }

    public Integer getIdGenreGame() {
        return idGenreGame;
    }

    public void setIdGenreGame(Integer idGenreGame) {
        this.idGenreGame = idGenreGame;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }
}
