package bo.ucb.edu.ingsoft.models;

public class Developer {
    private Integer idDeveloper;
    private Integer idPublisher;
    private String developer;

    public Developer(Integer idDeveloper, Integer idPublisher, String developer) {
        this.idDeveloper = idDeveloper;
        this.idPublisher = idPublisher;
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "Developers{" +
                "idDeveloper=" + idDeveloper +
                ", idPublisher=" + idPublisher +
                ", developer='" + developer + '\'' +
                '}';
    }

    public Integer getIdDeveloper() {
        return idDeveloper;
    }

    public void setIdDeveloper(Integer idDeveloper) {
        this.idDeveloper = idDeveloper;
    }

    public Integer getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Integer idPublisher) {
        this.idPublisher = idPublisher;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
