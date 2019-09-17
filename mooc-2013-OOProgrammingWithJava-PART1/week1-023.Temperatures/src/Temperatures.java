
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true)
        {
            System.out.print("Please insert a temperature from -30C to +40C: ");
            double temp = Double.parseDouble(reader.nextLine());
            if (temp >= -30 && temp <= 40)
            {
                Graph.addNumber(temp);
            }
            else
            {
                System.out.println("Temperature out of range");
            }
           
        }

        
    }
}
