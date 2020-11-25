package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Game extends Transactions implements Serializable {
  private Integer idGame;
  private Integer idEsrb;
  private Integer idDeveloper;
  private String name;
  private String description;
  private String size;
  private Integer players;
  private Timestamp releaseDate;
  private String processor;
  private String memory;
  private String graphics;
  private String color;
  private Integer highlight;
  private String downloadPath;
  private Integer status;
}
