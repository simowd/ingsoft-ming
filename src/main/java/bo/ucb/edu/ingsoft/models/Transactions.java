package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Transactions implements Serializable {
    private Integer txId;
    private String txHost;
    private Integer txUserId;
    private Date txDate;
}
