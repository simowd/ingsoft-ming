package bo.ucb.edu.ingsoft.models;

public class Languages {
    private Integer id_language;
    private String language;

    public Languages() {
    }

    public Integer getId_language() {
        return id_language;
    }

    public void setId_language(Integer id_language) {
        this.id_language = id_language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "id_language=" + id_language +
                ", language='" + language + '\'' +
                '}';
    }
}
