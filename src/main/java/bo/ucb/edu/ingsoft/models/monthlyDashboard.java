package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class monthlyDashboard implements Serializable {
  private Integer month;
  private Integer year;
  private Integer sells;
  private Double earnings;
}
