package bo.ucb.edu.ingsoft.models;

public class LanguageGame {
    private Integer idLanguageGame;
    private Integer idGame;
    private Integer idLanguage;

    public LanguageGame() {
    }

    @Override
    public String toString() {
        return "LanguageGame{" +
                "idLanguageGame=" + idLanguageGame +
                ", idGame=" + idGame +
                ", idLanguage=" + idLanguage +
                '}';
    }

    public Integer getIdLanguageGame() {
        return idLanguageGame;
    }

    public void setIdLanguageGame(Integer idLanguageGame) {
        this.idLanguageGame = idLanguageGame;
    }

    public Integer getIdGame() {
        return idGame;
    }

    public void setIdGame(Integer idGame) {
        this.idGame = idGame;
    }

    public Integer getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(Integer idLanguage) {
        this.idLanguage = idLanguage;
    }
}
