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
public class Publisher extends Transactions implements Serializable {
    private Integer idPublisher;
    private Integer idUser;
    private String publisher;
    private String paypalMail;
    private Integer status;
}