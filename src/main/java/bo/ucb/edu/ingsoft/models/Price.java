package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Price extends Transactions implements Serializable {
    private Integer idPrice;
    private Integer idGame;
    private Double price;
    private Timestamp date;
    private Double sale;
    private Integer status;
}
