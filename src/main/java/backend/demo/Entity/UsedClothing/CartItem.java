package backend.demo.Entity.UsedClothing;

import jakarta.persistence.Id;

public class CartItem { //장바구니 물건
    @Id
    private Long id;
    private String title;
    private int price;
}