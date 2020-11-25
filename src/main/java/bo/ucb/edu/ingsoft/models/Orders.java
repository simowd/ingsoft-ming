package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Orders extends Transactions implements Serializable {
    private Integer idOrder;
    private Integer idUser;
    private Date date;
    private Integer status;
}
