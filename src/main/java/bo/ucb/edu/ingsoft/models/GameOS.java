package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameOS extends Transactions implements Serializable {
    private Integer idGameOs;
    private Integer idGame;
    private Integer idOperatingSystem;
    private Integer status;

}
