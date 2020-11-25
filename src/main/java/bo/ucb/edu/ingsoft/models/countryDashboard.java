package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class countryDashboard implements Serializable {
    private String country;
    private Integer sells;
    private Double earnings;
}
