package bo.ucb.edu.ingsoft.models;

public class Esrb {
    private Integer idEsrb;
    private String esrb;
    private String logoPath;

    public Esrb() {
    }

    @Override
    public String toString() {
        return "Esrb{" +
                "idEsrb=" + idEsrb +
                ", esrb='" + esrb + '\'' +
                ", logoPath='" + logoPath + '\'' +
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

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }
}
