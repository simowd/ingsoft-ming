package bo.ucb.edu.ingsoft.models;

public class Country {
    private Integer idCountry;
    private String name;

    public Country() {
    }

    public Country(Integer idCountry, String name) {
        this.idCountry = idCountry;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
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