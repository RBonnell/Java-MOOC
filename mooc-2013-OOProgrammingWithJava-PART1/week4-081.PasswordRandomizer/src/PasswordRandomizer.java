import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;
    private String charSet = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pass = "";
        int counter = 0;
        while (counter < length){
        pass+= charSet.charAt(random.nextInt(charSet.length()));
        counter++;
        }
        return pass;
    }
}
