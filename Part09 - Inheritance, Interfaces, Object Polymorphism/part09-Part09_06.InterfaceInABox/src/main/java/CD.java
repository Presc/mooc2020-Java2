public class CD implements Packable {
    
    private String artist;
    private String name;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(artist);
        sb.append(": ").append(name);
        sb.append(" (").append(pubYear);
        sb.append(')');
        return sb.toString();
    }
    
    
    
}
