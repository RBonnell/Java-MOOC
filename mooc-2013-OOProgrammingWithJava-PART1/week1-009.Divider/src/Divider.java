
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        double firstNum = Double.parseDouble(reader.nextLine());
        System.out.print("Type another number: ");
        double secondNum = Double.parseDouble(reader.nextLine());
        double result = firstNum / secondNum;
        System.out.println("\nDivision: " + firstNum + " / " + secondNum + " = " + result);
    }
}
