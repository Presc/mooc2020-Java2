
import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class IOU {
    
    private HashMap<String, Double> debts;
    
    public IOU() {
        this.debts = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        double owed = 0;
        
        if(this.debts.containsKey(toWhom)) {
            return this.debts.get(toWhom);
        }
        
        return owed;
    }
    
}
