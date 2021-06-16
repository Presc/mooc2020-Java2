import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        double max = 0;
        if (history.isEmpty()) {
            return max;
        } else {
            for (double value : history) {
                max = Math.max(max, value);
            }
        }
        return max;
    }
    
    public double minValue() {        
        if (history.isEmpty()) {
            return 0;
        } else {
            double min = this.history.get(0);
            for (double value : history) {
                min = Math.min(min, value);
            }
            return min;
        }        
    }
    
    public double average() {
        double avg = 0;
        int count = 0;
        if (history.isEmpty()) {
            return avg;
        } else {
            for (double value : history) {
                avg += value;
                count++;
            }
        }
        return avg/count;
    }
    
    public String toString() {
        return history.toString();
    }
    
}
