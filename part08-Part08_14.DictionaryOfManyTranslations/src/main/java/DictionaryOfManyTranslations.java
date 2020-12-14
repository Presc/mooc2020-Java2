
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> translationList = this.translations.get(word);
        translationList.add(translation);
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> translationsForWord = new ArrayList<>();
        if (translations.containsKey(word)) {
            translationsForWord = this.translations.get(word);
        }
        
        return translationsForWord;
    }
    
    public void remove(String word) {
        this.translations.remove(word);
    }
}
