
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int count = 0;
        while (count < 7) {
            int num = random.nextInt(39) + 1;
            if (!containsNumber(num)) {
                numbers.add(num);
                count++;
            }

        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return (numbers.contains(number)); 
    }
}
