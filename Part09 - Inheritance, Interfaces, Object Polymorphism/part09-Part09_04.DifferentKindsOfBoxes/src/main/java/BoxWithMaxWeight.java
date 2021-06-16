
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
               
    }

    @Override
    public void add(Item item) {
        if (capacity >= weight() + item.getWeight()) {
            items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
    public int weight() {
        int sum = 0;
        for (Item item: items) {
            sum += item.getWeight();
        }
        return sum;
    }

}
