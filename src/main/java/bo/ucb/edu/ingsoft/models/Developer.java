package bo.ucb.edu.ingsoft.models;

public class Developer extends Transactions {
    private Integer idDeveloper;
    private Integer idPublisher;
    private String developer;
    private Integer status;

    public Developer() {

    }

    @Override
    public String toString() {
        return "Developer{" +
                "idDeveloper=" + idDeveloper +
                ", idPublisher=" + idPublisher +
                ", developer='" + developer + '\'' +
                ", status=" + status +
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
