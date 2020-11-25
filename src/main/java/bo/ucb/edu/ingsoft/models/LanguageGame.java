package bo.ucb.edu.ingsoft.models;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LanguageGame extends Transactions{
    private Integer idLanguageGame;
    private Integer idGame;
    private Integer idLanguage;
    private Integer status;
}
