
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int lowNumber,
            highNumber;
        
        System.out.println("Time to count!");
        System.out.print("What number would you like to start with? ");
        lowNumber = Integer.parseInt(reader.nextLine());
        System.out.print("What number would you like to end with? ");
        highNumber = Integer.parseInt(reader.nextLine());
        while(lowNumber <= highNumber)
        {
            System.out.println(lowNumber);
            lowNumber ++;
        }
        
        

    }
}
