import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1,
            number;
        Scanner reader = new Scanner(System.in);
        System.out.print("Calculate a factorial. Enter a number: >> ");
        number = Integer.parseInt(reader.nextLine());
        while (number > 0)
        {
            factorial *= number;
            number--;
        }
        System.out.println("Factorial is " + factorial);

    }
}
