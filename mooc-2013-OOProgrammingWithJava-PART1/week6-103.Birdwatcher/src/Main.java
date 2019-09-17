
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    Scanner reader = new Scanner(System.in);
    String answer = "",
           name = "",
           latinName = "";
    Aviary aviary = new Aviary();
    
    while (!answer.toLowerCase().equals("quit")){
        System.out.print("? ");
        answer = reader.nextLine();
    
            if (answer.toLowerCase().equals("add")){
                System.out.print("Name: ");
                name = reader.nextLine();
                System.out.print("Latin Name: ");
                latinName = reader.nextLine();
                Bird bird = new Bird(name, latinName);
                aviary.Add(bird);
            }

            if (answer.toLowerCase().equals("observation")){
                System.out.print("What was observed? ");
                aviary.Observation(reader.nextLine());
            }

            if (answer.toLowerCase().equals("statistics")){
                aviary.Statistics();
            }

            if (answer.toLowerCase().equals("show")){
                System.out.print("What? ");
                name = reader.nextLine();
                for (Bird bird : aviary.getBirdList()){
                    if (bird.GetName().toLowerCase().equals(name.toLowerCase())){
                        aviary.Show(bird);
                    }
                }
            }
        }
    }
}

    
