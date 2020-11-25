package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OperatingSystem implements Serializable {
  private Integer idOperatingSystem;
  private String operatingSystem;
  private String logoPath;
}
