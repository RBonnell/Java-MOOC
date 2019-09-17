
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 358721
 */
public class VehicleRegister {
    private Map<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if (!owners.containsKey(plate)){
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate){
        if (!owners.containsKey(plate)){
            return null;
        }
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if (owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate key : owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerList = new ArrayList<String>();
        for (String owner : owners.values()){
            if(!ownerList.contains(owner)){
                ownerList.add(owner);
            }
        }
        for (String owner : ownerList){
            System.out.println(owner);
        }
    }
}
