package bo.ucb.edu.ingsoft.models;

public class LanguagesGames {
    private Integer id_languages_games;
    private Integer id_game;
    private Integer id_language;

    public LanguagesGames() {
    }

    public Integer getId_languages_games() {
        return id_languages_games;
    }

    public void setId_languages_games(Integer id_languages_games) {
        this.id_languages_games = id_languages_games;
    }

    public Integer getId_game() {
        return id_game;
    }

    public void setId_game(Integer id_game) {
        this.id_game = id_game;
    }

    public Integer getId_language() {
        return id_language;
    }

    public void setId_language(Integer id_language) {
        this.id_language = id_language;
    }

    @Override
    public String toString() {
        return "LanguagesGames{" +
                "id_languages_games=" + id_languages_games +
                ", id_game=" + id_game +
                ", id_language=" + id_language +
                '}';
    }
}
