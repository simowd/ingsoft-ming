package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetHighlightRequest {
    private Integer id;
    private Integer highlight;

    public SetHighlightRequest() {
    }

    @Override
    public String toString() {
        return "SetHighlightRequest{" +
                "id=" + id +
                ", highlight=" + highlight +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHighlight() {
        return highlight;
    }

    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }
}
