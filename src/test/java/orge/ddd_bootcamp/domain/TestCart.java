package orge.ddd_bootcamp.domain;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCart {

    @Test
    public void equalsShouldBeFalseWhenTwoCartsAreComparedWithSameProduct() {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone"), 1);
        Item item2 = new Item(new Product("Sony Wireless headphone"), 1);
        cart1.add(item1);
        cart2.add(item2);

        assertFalse(cart1.equals(cart2));
    }

    @Test
    public void equalsShouldBeTrueWhenComparingTheSameCart() {
        Cart cart1 = new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone"), 1);
        cart1.add(item1);

        assertTrue(cart1.equals(cart1));
    }
}
