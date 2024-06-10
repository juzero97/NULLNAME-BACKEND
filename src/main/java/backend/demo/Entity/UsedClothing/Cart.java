package backend.demo.Entity.UsedClothing;

import jakarta.persistence.Id;

public class Cart {//장바구니

    @Id
    private Long id;
    private String username;
    private int totalPrice;
    private int deliveryFee;
}