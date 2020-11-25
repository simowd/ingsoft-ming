package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Library extends Transactions implements Serializable {
  private Integer idLibrary;
  private Integer idUser;
  private Integer idGame;
  private Integer status;
  private Integer download;
}
