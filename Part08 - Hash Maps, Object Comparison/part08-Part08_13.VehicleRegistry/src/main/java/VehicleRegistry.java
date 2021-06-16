
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry() {
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.get(licensePlate) != null) {
            return false;
        }
        owners.put(licensePlate, owner);
        return true;
    }
    
    public String get(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            return owners.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (owners.containsKey(licensePlate)) {
            owners.remove(licensePlate);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates() {
        for (LicensePlate licensePlate: owners.keySet()) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownersPrint = new ArrayList<>();
        
        for (LicensePlate licensePlate: owners.keySet()) {
            if (!ownersPrint.contains(owners.get(licensePlate))) {
                System.out.println(owners.get(licensePlate));
                ownersPrint.add(owners.get(licensePlate));
            }
        }
    }
    
}
