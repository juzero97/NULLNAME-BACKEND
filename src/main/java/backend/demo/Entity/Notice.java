package backend.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Locale;

@Entity
public class Notice {
    @Id
    private Long id;
    private String title;
    private String content;
    private LocalDate date;

}
