package backend.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Storage {
    @Id
    @GeneratedValue
    @Column(name = "storage_id")
    private Long id;
    private int Size;

    private String Product;

    private String Status;

    private String Complete;

    private int quantity;

    private String kind;

    private String category;

    private String condition;

    private LocalDate registerDate;
}
