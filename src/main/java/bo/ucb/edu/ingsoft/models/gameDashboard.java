package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class gameDashboard implements Serializable {
    private String game;
    private Integer sells;
    private Double earnings;
}
