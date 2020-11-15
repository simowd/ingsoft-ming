package bo.ucb.edu.ingsoft.models;

public class Country {
    private Integer idCountry;
    private String name;
    private int status;

    public Country() {
    }

    public Country(Integer idCountry, String name, int status) {
        this.idCountry = idCountry;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Country{" +
                "idCountry=" + idCountry +
                ", name='" + name + '\'' +
                ", status=" + status +
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}