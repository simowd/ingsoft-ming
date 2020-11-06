package bo.ucb.edu.ingsoft.models;

public class OperatingSystem {
    private Integer idOperatingSystem;
    private String operatingSystem;
    private String logoPath;

    public OperatingSystem() {
    }

    public Integer getIdOperatingSystem() {
        return idOperatingSystem;
    }

    public void setIdOperatingSystem(Integer idOperatingSystem) {
        this.idOperatingSystem = idOperatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "id_operating_system=" + idOperatingSystem +
                ", operating_system='" + operatingSystem + '\'' +
                ", logo_path='" + logoPath + '\'' +
                '}';
    }
}
