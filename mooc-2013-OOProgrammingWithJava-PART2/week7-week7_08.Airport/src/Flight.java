
import java.util.HashMap;

/**
 *
 * @author 358721
 */
public class Flight {
    private HashMap<String,Plane> flights;
    
    public Flight(){
        this.flights = new HashMap<String, Plane>();
    }
    
    public void addFlight(String route, Plane plane){
        this.flights.put(route, plane);
    }
    
    public void printFlights(){
        for(String route: this.flights.keySet()){
            System.out.println(this.flights.get(route) + " " + route);
        }
        System.out.println();
    }
}