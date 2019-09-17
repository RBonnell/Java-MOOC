
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        int num = 0;

        while (num != -1) {
            System.out.println("Type numbers: ");
            num = reader.nextInt();
            if (num != -1) {
                stats.addNumber(num);
                if (num % 2 == 0) {
                    even.addNumber(num);
                } else {
                    odd.addNumber(num);
                }

            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }

}
