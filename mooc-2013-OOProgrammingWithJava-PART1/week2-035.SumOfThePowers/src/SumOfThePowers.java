
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sum of power of 2.  Enter a number: >> ");
        int power = 0;
        int result = 0;
        int number = Integer.parseInt(reader.nextLine());
        while(power <= number)
        {
            result += (Math.pow(2, power));
            power++;            
        }
        System.out.println("The result is " + result);

    }
}
