public class Student extends Person{
    
    private int credits; 
    
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }
    
    public void study() {
        credits += 1;
    }
    
    public int credits() {
        return credits;
    }
    
    public String toString() {
        return super.toString() + "\n  Study credits " + credits;
    }
    
}
