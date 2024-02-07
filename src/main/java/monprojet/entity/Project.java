package monprojet.entity;

import jakarta.validation.constraints.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int code;

    @NonNull
    String nom;

    LocalDate debut;

    LocalDate fin;

    @OneToMany(mappedBy = "project")
    private ArrayList<ProjectAssignment> projectAssignments;
}
