package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameRequirements extends Transactions implements Serializable {
    private Integer idGameRequirement;
    private Integer idGame;
    private Integer idOperatingSystem;
    private String processor;
    private String memory;
    private String graphics;
    private Integer status;
}
