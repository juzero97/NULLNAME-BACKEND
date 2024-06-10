package backend.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Dispose {
    @Id
    private Long id;
    private String description;
    private LocalDate requestDate;
}
