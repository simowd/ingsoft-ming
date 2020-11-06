package bo.ucb.edu.ingsoft.models;

public class Directx {

    private Integer idDirectx;
    private String version;

    public Directx(Integer idDirectx, String version) {
        this.idDirectx = idDirectx;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Directx{" +
                "idDirectx=" + idDirectx +
                ", version='" + version + '\'' +
                '}';
    }

    public Integer getIdDirectx() {
        return idDirectx;
    }

    public void setIdDirectx(Integer idDirectx) {
        this.idDirectx = idDirectx;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
