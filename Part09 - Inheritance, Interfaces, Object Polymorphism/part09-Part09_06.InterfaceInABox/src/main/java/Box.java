
import java.util.ArrayList;

public class Box implements Packable {
    
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box (double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= capacity) {
            items.add(item);
        }
    }
        
    @Override
    public double weight() {
        double sum = 0;
        
        for (Packable item: items) {
            sum += item.weight();
        }
        
        return (double) sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Box: ").append(items.size());
        sb.append(" items, total weight ").append(this.weight());
        sb.append(" kg");
        return sb.toString();
    }
    
    
}
