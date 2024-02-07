package monprojet.entity;

import jakarta.persistence.Entity;
import jdk.jfr.Percentage;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Commercial extends Employe {
    @NonNull
    float percent;
}
