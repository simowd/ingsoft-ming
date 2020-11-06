package bo.ucb.edu.ingsoft.models;

import java.util.Date;

public class Transactions {
    private Integer txId;
    private String txHost;
    private Integer txUser;
    private Date txDate;

    public Transactions() {
    }

    public Transactions(Integer txId, String txHost, Integer txUser, Date txDate) {
        this.txId = txId;
        this.txHost = txHost;
        this.txUser = txUser;
        this.txDate = txDate;
    }

    public Integer getTxId() {
        return txId;
    }

    public void setTxId(Integer txId) {
        this.txId = txId;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Integer getTxUser() {
        return txUser;
    }

    public void setTxUser(Integer txUser) {
        this.txUser = txUser;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUser=" + txUser +
                ", txDate=" + txDate +
                '}';
    }

}
