package backend.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EventTicket {
    @Id
    private Long id;

    private String Tickets;
}
