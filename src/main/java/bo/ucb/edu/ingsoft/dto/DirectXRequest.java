package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DirectXRequest {
    private Integer idDirectx;
    private String directx;

    public DirectXRequest() {
    }

    public DirectXRequest(Integer idDirectx, String directx) {
        this.idDirectx = idDirectx;
        this.directx = directx;
    }

    @Override
    public String toString() {
        return "DirectXRequest{" +
                "idDirectx=" + idDirectx +
                ", directx='" + directx + '\'' +
                '}';
    }

    public Integer getIdDirectx() {
        return idDirectx;
    }

    public void setIdDirectx(Integer idDirectx) {
        this.idDirectx = idDirectx;
    }

    public String getDirectx() {
        return directx;
    }

    public void setDirectx(String directx) {
        this.directx = directx;
    }
}
