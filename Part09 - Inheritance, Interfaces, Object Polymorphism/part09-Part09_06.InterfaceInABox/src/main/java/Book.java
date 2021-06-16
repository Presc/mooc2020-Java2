public class Book implements Packable {

    private String author;
    private String name;
    private double weight;
    
    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(author);
        sb.append(": ").append(name);        
        return sb.toString();
    }
       
    
    
    
}
