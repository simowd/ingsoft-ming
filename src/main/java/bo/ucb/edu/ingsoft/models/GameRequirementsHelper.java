package bo.ucb.edu.ingsoft.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameRequirementsHelper implements Serializable {
    private String operatingSystem;
    private String processor;
    private String memory;
    private String graphics;
}
