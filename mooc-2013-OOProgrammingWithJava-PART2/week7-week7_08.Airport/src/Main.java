
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 358721
 */

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Flight flight = new Flight();
        ArrayList<Plane> planes = new ArrayList<Plane>();
        
        UserInterface airport = new UserInterface(reader, flight, planes);
        airport.start();
    }
}