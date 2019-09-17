
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNum = Integer.parseInt(reader.nextLine());
        System.out.print("Type a number: ");
        int secondNum = Integer.parseInt(reader.nextLine());
        int largerNum = Math.max(firstNum, secondNum);
        
        System.out.print("\nThe bigger of the two numbers given was: " + largerNum);

        // Implement your program here. Remember to ask the input from user
    }
}
