
import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class Abbreviations {
    private HashMap<String,String> abbreviations;
    
    public Abbreviations() {
        abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        String key = cleanString(abbreviation);
        this.abbreviations.put(key, explanation);
        
    }
    
    
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = cleanString(abbreviation);
        
        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        }
        
        return false;
    }
    
    public String findExplanationFor(String abbreviation) {
        abbreviation = cleanString(abbreviation);
        
        if(abbreviations.containsKey(abbreviation)) {
            return this.abbreviations.get(abbreviation);
        }
        
        return null;
    }
    
    public static String cleanString(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();        
    }
}
