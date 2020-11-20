package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class CountryRequest {
    private Integer idCountry;
    private String name;

    public CountryRequest() {
    }

    public CountryRequest(Integer idCountry, String name) {
        this.idCountry = idCountry;
        this.name = name;
    }

    @Override
    public String toString() {
        return "CountryRequest{" +
                "idCountry=" + idCountry +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
