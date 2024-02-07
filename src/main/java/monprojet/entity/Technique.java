package monprojet.entity;

import jakarta.persistence.Entity;
import jdk.jfr.Percentage;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Technique extends Employe {
    float montantPrime;
}
