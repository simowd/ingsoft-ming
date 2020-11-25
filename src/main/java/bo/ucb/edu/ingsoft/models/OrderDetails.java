package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDetails extends Transactions implements Serializable {
    private Integer idOrderDetails;
    private Integer idGame;
    private Integer idOrder;
    private Double price;
    private Integer status;
}
