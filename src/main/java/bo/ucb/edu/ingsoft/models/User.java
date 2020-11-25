package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User extends Transactions implements Serializable {
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

}
