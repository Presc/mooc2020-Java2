import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    
    private Map<String, Item> cartContents;
    
    public ShoppingCart() {
        this.cartContents = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if(cartContents.containsKey(product)) {
            cartContents.get(product).increaseQuantity();
        } else {
            cartContents.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int cartPrice = 0;
        
        for(Item item: cartContents.values()) {
            cartPrice += item.price();
        }
        return cartPrice;
    }
    
    public void print() {
        for(Item item: cartContents.values()) {
            System.out.println(item);
        }
    }
    
}
