
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class StorageFacility {

    private HashMap<String, ArrayList<String>> items;
    
    public StorageFacility() {
        this.items = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.items.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> itemList = this.items.get(unit);        
        itemList.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> contentList = new ArrayList<>();
        if (this.items.containsKey(storageUnit)) {
            contentList = this.items.get(storageUnit);
        }
        
        return contentList;
        
    }
    
    public void remove(String storageUnit, String item) {
        if (items.containsKey(storageUnit)) {
            for (int i = 0; i < items.get(storageUnit).size(); i++) {
                if (items.get(storageUnit).get(i).equals(item)) {
                    items.get(storageUnit).remove(i);
                    break;
                }
            }            
        }
        if(items.get(storageUnit).isEmpty()) {
            items.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsList = new ArrayList<>();
        
        for(String unit: items.keySet()) {
            unitsList.add(unit);
        }
        return unitsList;
    }
}
