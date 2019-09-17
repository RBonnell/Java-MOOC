
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int counter = 1;
        System.out.print("What number would you like to count to? ");
        int number = Integer.parseInt(reader.nextLine());
        while (counter < (number + 1))
        {
            System.out.println(counter);
            counter++;
        }
        
    }
}
