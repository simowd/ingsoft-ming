package bo.ucb.edu.ingsoft.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasswordRequest {
    private String old_password;
    private String new_password;

    public PasswordRequest() {
    }

    @Override
    public String toString() {
        return "PasswordRequest{" +
                "old_password='" + old_password + '\'' +
                ", new_password='" + new_password + '\'' +
                '}';
    }

    public String getOld_password() {
        return old_password;
    }

    public void setOld_password(String old_password) {
        this.old_password = old_password;
    }

    public String getNew_password() {
        return new_password;
    }

    public void setNew_password(String new_password) {
        this.new_password = new_password;
    }
}
