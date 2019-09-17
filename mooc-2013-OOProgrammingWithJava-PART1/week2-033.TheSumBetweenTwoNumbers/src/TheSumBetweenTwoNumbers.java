
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0,
            lowNum,
            highNum;
        
        System.out.println("Count between 2 numbers");
        System.out.print("Please input the first number >>");
        lowNum = Integer.parseInt(reader.nextLine());
        System.out.print("Please input the second number >>");
        highNum = Integer.parseInt(reader.nextLine());
        
        while (lowNum <= highNum)
        {
            System.out.println(sum + "(+" + lowNum + ")"); //displays incremented count
            sum += lowNum;
            lowNum++;
        }
        System.out.println("The sum is: " + sum);
        
    }
}
