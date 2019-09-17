
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author 358721
 */
public class UserInterface{
    private Scanner input = new Scanner(System.in);
    private List<Jumper> jumpers;
    private int round = 1;

    public UserInterface(){
        jumpers = new ArrayList<Jumper>();
    }

    public void start(){
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time;"
                         + " an empty string brings you to the jumping phase.");

        getJumpers();

        System.out.println("\nThe tournament begins!");
        
        while (true){
            System.out.print("\nWrite \"jump\" to jump; otherwise you quit: ");
            String answer = input.nextLine();
            if (answer.equals("jump")) {
                System.out.println("\nRound " + round + "\n");
                System.out.println("Jumping order:");
                
                displayJumperOrder();
                
                System.out.println("\nResults of round " + round + "\n");
                takeJumps();
                round++;
            }
            else{
                System.out.println("\nThanks!");
                break;
            }
        }
        printResults();
    }

    public void getJumpers(){
        while(true){
            System.out.print("  Participant name: ");
            String name = input.nextLine();
            if (name.equals("")){
                break;
            }
            else{
                Jumper jumper = new Jumper(name);
                jumpers.add(jumper);
            }
        }
    }

    public void displayJumperOrder(){
        Collections.sort(jumpers);
        int i = 1;
        for (Jumper jumper : jumpers){
            System.out.println("  " + i + ". " + jumper);
            i++;
        }
    }

    public void takeJumps(){
        for (Jumper jumper : jumpers){
            Jump jump = new Jump();
            jump.takeJump();
            jumper.addJump(jump.getScore(), jump.getLength());

            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jump.getLength());
            System.out.println("    judge votes: " + jump);
        }
    }

    public void printResults() {
        System.out.println("\nTournament results:");
        System.out.println("Position    Name");
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
       
        int i = 1;
        for (Jumper jumper : jumpers){
            System.out.println(i + "           " + jumper);
            jumper.printJumps();
            System.out.println();
            i++;
        }
    }
}