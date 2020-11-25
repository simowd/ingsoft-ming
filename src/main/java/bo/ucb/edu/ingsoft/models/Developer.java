package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Developer extends Transactions implements Serializable {
    private Integer idDeveloper;
    private Integer idPublisher;
    private String developer;
    private Integer status;

}
