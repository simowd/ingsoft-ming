package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Esrb implements Serializable {
  private Integer idEsrb;
  private String esrb;
  private String logoPath;
}
