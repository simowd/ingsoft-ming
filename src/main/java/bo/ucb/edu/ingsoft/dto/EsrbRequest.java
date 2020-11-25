package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EsrbRequest {
    private Integer idEsrb;
    private String esrb;

    public EsrbRequest() {
    }

    public EsrbRequest(Integer idEsrb, String esrb) {
        this.idEsrb = idEsrb;
        this.esrb = esrb;
    }

    @Override
    public String toString() {
        return "EsrbRequest{" +
                "idEsrb=" + idEsrb +
                ", esrb='" + esrb + '\'' +
                '}';
    }

    public Integer getIdEsrb() {
        return idEsrb;
    }

    public void setIdEsrb(Integer idEsrb) {
        this.idEsrb = idEsrb;
    }

    public String getEsrb() {
        return esrb;
    }

    public void setEsrb(String esrb) {
        this.esrb = esrb;
    }
}
