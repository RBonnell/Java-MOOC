
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();
    
    public Changer(){
    }
    
    public void addChange(Change change){
        changes.add(change);
    }
    
    public String change(String characterString){
        String changed = characterString;
        for(Change change : changes){           //for each change in the array
            changed = change.change(changed);   //execute the changes
        }
        return changed; //return the String variable with all changes applied
    }
    
}
