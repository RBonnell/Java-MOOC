
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        String response = "";
        System.out.print("Statements:\n"
                + "  add - adds a pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quit the text user interface\n\n");
        
        while(true){
            System.out.print("Statement: ");
            response = reader.nextLine();
            if (response.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if (response.equals("translate")){
                System.out.print("Give a word: ");
                response = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(response));
            }
            else if (response.equals("add")){
                String finWord;
                String engWord;
                System.out.print("In Finnish: ");
                finWord = reader.nextLine();
                System.out.print("Translation: ");
                engWord = reader.nextLine();
                dictionary.add(finWord, engWord);
            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }
}

