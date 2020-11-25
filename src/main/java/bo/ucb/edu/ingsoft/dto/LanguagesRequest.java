package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LanguagesRequest {
    private Integer idLanguage;
    private String language;

    public LanguagesRequest() {
    }

    public LanguagesRequest(Integer idLanguage, String language) {
        this.idLanguage = idLanguage;
        this.language = language;
    }

    @Override
    public String toString() {
        return "LanguagesRequest{" +
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
