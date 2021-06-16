public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);     
        
        this.changeHistory = new ChangeHistory();
        super.addToWarehouse(initialBalance);        
        changeHistory.add(initialBalance);
    }
    
    public String history() {
        return this.changeHistory.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double taken = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return taken;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
}
