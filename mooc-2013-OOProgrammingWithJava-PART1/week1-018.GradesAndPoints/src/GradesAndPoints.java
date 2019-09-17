
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int points;
        System.out.print("Type the points [0-60]: ");
        points = Integer.parseInt(reader.nextLine());
        while (points > 60 || points < 0)
        {
            System.out.print("Type the points [0-60]: ");
        }
        
        if (points >= 50)
        {
            System.out.println("Grade: 5");
        }
        else if (points >= 45)
        {
            System.out.println("Grade: 4");
        }
        else if (points >= 40)
        {
            System.out.println("Grade: 3");
        }
        else if (points >= 35)
        {
            System.out.println("Grade: 2");
        }
        else if (points >= 30)
        {
            System.out.println("Grade: 1");
        }
        else
        {
            System.out.println("Grade: failed");
        }

    }
}
