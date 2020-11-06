package bo.ucb.edu.ingsoft.models;

public class OperatingSystem {
    private Integer id_operating_system;
    private String operating_system;
    private String logo_path;

    public OperatingSystem() {
    }

    public Integer getId_operating_system() {
        return id_operating_system;
    }

    public void setId_operating_system(Integer id_operating_system) {
        this.id_operating_system = id_operating_system;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getLogo_path() {
        return logo_path;
    }

    public void setLogo_path(String logo_path) {
        this.logo_path = logo_path;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "id_operating_system=" + id_operating_system +
                ", operating_system='" + operating_system + '\'' +
                ", logo_path='" + logo_path + '\'' +
                '}';
    }
}
