/**
 *
 * @author 358721
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, Set<String>> numberByName;
    private Map<String, String> nameByNumber;
    private Map<String, Address> addressByName;
    
    public PhoneBook(){
        this.numberByName = new HashMap<String, Set<String>>();
        this.nameByNumber = new HashMap<String, String>();
        this.addressByName = new HashMap<String, Address>();
    }
    
    public void addNumber(String name, String number) {
        if (!numberByName.containsKey(name)) {
            numberByName.put(name, new HashSet<String>());
        }
        if (!nameByNumber.containsKey(number)) {
            nameByNumber.put(number, name);
        }
        numberByName.get(name).add(number);
    }
    
    public void getNumberByName(String name){
        if (numberByName.containsKey(name)){
            for (String number : numberByName.get(name)){
                System.out.println(" " + number);
            }
        } 
        else{
            System.out.println("  not found");
        }
    }

    public void getNameByNumber(String number){
        if (nameByNumber.containsKey(number)){
            System.out.println(" " + nameByNumber.get(number));
        } 
        else{
            System.out.println(" not found");
        }
    }

    public void addAddress(String name, String street, String city){
        addressByName.put(name, new Address(street, city));
    }

    public void getPersonalInfo(String name){
        if (!addressByName.containsKey(name) && !numberByName.containsKey(name)){
            System.out.println("  not found");
        } 
        else{
            if (addressByName.containsKey(name)){
                System.out.println("  address: " + addressByName.get(name));
            } 
            else{
                System.out.println("  address unknown");
            }
            
            if (numberByName.containsKey(name)){
                System.out.println("  phone numbers:");
                for (String number : numberByName.get(name)){
                    System.out.println("   " + number);
                }
            } 
            else{
                System.out.println("  phone number not found");
            }
        }
    }

    public void deletePersonalInfo(String name){
        if (numberByName.containsKey(name)){
            for (String number : numberByName.get(name)){
                nameByNumber.remove(number);
            }
            numberByName.remove(name);
        }
        
        if (addressByName.containsKey(name)){
            addressByName.remove(name);
        }
    }

    public void filteredListing(String searched){
        SortedMap<String, Set<String>> numberByNameSorted = new TreeMap<String, Set<String>>(numberByName);
        boolean found = false;
        
        for (String name : numberByNameSorted.keySet()){
            if (name.contains(searched) || (addressByName.containsKey(name) 
                    && addressByName.get(name).addressContainsKeyword(searched))){
                found = true;
                System.out.println("\n " + name);
                getPersonalInfo(name);
            }
        }
        if (!found){
            System.out.println("  search not found");
        }
    }
}