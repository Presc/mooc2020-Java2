import java.util.*;

public class Herd implements Movable {

    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable o: herd) {
            o.move(dx, dy);
        }
    }   
    
    public String toString() {
        String output = "";
        
        for(Movable o: herd) {
            output += o + "\n";
        }
        
        return output;
    }
    
}
