package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameDirectx extends Transactions implements Serializable {
    private Integer idGameDirectx;
    private Integer idGame;
    private Integer idDirectx;
    private Integer status;
}


