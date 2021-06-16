
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;
    
    public Warehouse() {
        this.productPrices = new HashMap<>();
        this.productStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStock.put(product, stock);
    }
        
    public int price(String product) {
        return productPrices.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return productStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if(this.stock(product) > 0) {
            productStock.put(product, productStock.get(product) - 1);            
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return productStock.keySet();
    }
}
