package backend.demo.Entity.Reserve;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Care {
    @Id
    private Long id;
    private String careType;
    private double carePrice;
    private String careDescription;
}
