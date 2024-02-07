package monprojet.entity;

import jakarta.persistence.Entity;
import jdk.jfr.Percentage;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Administratif extends Employe {
    String diplome;
}
