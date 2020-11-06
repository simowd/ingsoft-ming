package bo.ucb.edu.ingsoft.models;

public class Language {
    private Integer idLanguage;
    private String language;

    public Language() {
    }

    @Override
    public String toString() {
        return "Language{" +
                "idLanguage=" + idLanguage +
                ", language='" + language + '\'' +
                '}';
    }

    public Integer getIdLanguage() {
        return idLanguage;
    }

    public void setIdLanguage(Integer idLanguage) {
        this.idLanguage = idLanguage;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
