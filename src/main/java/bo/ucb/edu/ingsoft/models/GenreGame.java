package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GenreGame  extends Transactions implements Serializable {

    private Integer idGenreGame;
    private Integer idGame;
    private Integer idGenre;
}
