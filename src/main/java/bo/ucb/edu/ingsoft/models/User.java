package bo.ucb.edu.ingsoft.models;

import java.sql.Timestamp;

public class User {
    private Integer idUser;
    private Integer idCountry;
    private String userName;
    private String password;
    private String email;
    private Integer userType;
    private String photoPath;
    private String name;
    private String lastName;
    private String alias;
    private Integer status;
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Timestamp txDate;

    public User() {
    }

    public User(Integer idUser, Integer idCountry, String userName, String password, String email, Integer userType, String photoPath, String name, String lastName, String alias, Integer status, Integer txId, String txHost, Integer txUserId, Timestamp txDate) {
        this.idUser = idUser;
        this.idCountry = idCountry;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.userType = userType;
        this.photoPath = photoPath;
        this.name = name;
        this.lastName = lastName;
        this.alias = alias;
        this.status = status;
        this.txId = txId;
        this.txHost = txHost;
        this.txUserId = txUserId;
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", idCountry=" + idCountry +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userType=" + userType +
                ", photoPath='" + photoPath + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alias='" + alias + '\'' +
                ", status=" + status +
                ", txId=" + txId +
                ", txHost='" + txHost + '\'' +
                ", txUserId=" + txUserId +
                ", txDate=" + txDate +
                '}';
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getTxUserId() {
        return txUserId;
    }

    public void setTxUserId(Integer txUserId) {
        this.txUserId = txUserId;
    }

    public Timestamp getTxDate() {
        return txDate;
    }

    public void setTxDate(Timestamp txDate) {
        this.txDate = txDate;
    }
}
