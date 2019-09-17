
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.print("Guess a number: ");
        int numberGuessed = reader.nextInt();
        int guesses = 0;
        while(numberGuessed != numberDrawn){
        if (numberGuessed < numberDrawn){
            guesses ++;
            System.out.println("The number is greater, guesses made: " + guesses);
            System.out.print("Guess a number: ");
            numberGuessed = reader.nextInt();
        }
        else if (numberGuessed > numberDrawn){
            guesses++;
            System.out.println("The number is lesser, guesses made: " + guesses);
            System.out.print("Guess a number: ");
            numberGuessed = reader.nextInt();
        }
        }
        if (numberGuessed == numberDrawn){
            System.out.println("Congratulations, your guess is correct!");
        }
       
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
