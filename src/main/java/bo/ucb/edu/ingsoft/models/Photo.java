package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Photo  extends Transactions  implements Serializable {
    private Integer idPhoto;
    private Integer idGame;
    private String photoPath;
    private Integer type;
    private Integer status;
}
