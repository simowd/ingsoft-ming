package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameHelper implements Serializable {
    private Integer limit;
    private Integer offset;
    private String query;
    private Boolean highlight;
    private Boolean latest;
    private Boolean sale;
    private String publisher;
}
