
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sum = 0,
            nextNum = 1,
            target;
            
        System.out.print("Add a sequence of numbers.  Where do you want to end? ");
        target = Integer.parseInt(reader.nextLine());
        while (nextNum <= target)
        {
            sum += nextNum;
            nextNum++;
        }
        System.out.println("Sum is " + sum);
    }
}
