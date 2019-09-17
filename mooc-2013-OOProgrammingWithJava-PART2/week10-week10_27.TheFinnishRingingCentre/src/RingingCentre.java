
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 358721
 */
public class RingingCentre {
    private Map<Bird, List<String>> observationList;
    
    public RingingCentre(){
        this.observationList = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        if (!observationList.containsKey(bird)) { // create if !exists
            observationList.put(bird, new ArrayList<String>()); 
        }
        observationList.get(bird).add(place); // add location
    }
    
   public void observations(Bird bird) {
        System.out.print(bird.toString() + " observations: ");
        
        if (!observationList.containsKey(bird)){
            System.out.println("0");
        } 
        else{
            System.out.println(observationList.get(bird).size());
            
            for (String place : observationList.get(bird)){
                System.out.println(place);
            }
        }
    }
}
