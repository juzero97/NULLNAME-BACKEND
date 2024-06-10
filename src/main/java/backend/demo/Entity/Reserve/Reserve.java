package backend.demo.Entity.Reserve;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Reserve {
    @Id
    private Long id;
    private LockerType lockertype;
    private int boxQuantity;
    private String timeslot;
    private String pickupTime;
    private PickupMethod pickupLocation;
    private String address;
    private double totalPrice;
    @OneToOne
    private Care care;
}
