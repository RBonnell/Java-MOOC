package dungeon;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 358721
 */
public class Dungeon {

    private Random random = new Random();
    private Scanner reader = new Scanner(System.in);
    private ArrayList<Vampire> vampires;
    private int height;
    private int length;
    private int blinksLeft;
    private int vampireAmount;
    private boolean vampiresMove;
    private Player player;

    public Dungeon(int length, int height, int vampireAmount, int moves, boolean vampiresMove){
        this.length = length;
        this.height = height;
        this.vampires = new ArrayList<Vampire>();
        this.blinksLeft = moves;
        this.vampireAmount = vampireAmount;
        this.vampiresMove = vampiresMove;
        this.player = new Player(this.length, this.height);

        generateVampires(vampireAmount);
    }

    public void run(){
        while (this.blinksLeft > 0){
            this.displayGameInfo();

            while (this.checkOverlap()){
                generateVampires(this.vampireAmount);
            }

            this.displayMap();
            this.turn();

            if (vampires.size() == 0){
                System.out.println("YOU WIN");
                break;
            }
            this.blinksLeft--;
        }

        if (vampires.size() > 0){
            System.out.println("YOU LOSE");
        }
    }

    public void displayGameInfo(){
        System.out.println(this.blinksLeft + "\n\n" + this.player);
        for (Vampire vampire : this.vampires) {
            System.out.println(vampire);
        }
        System.out.println();
    }
    
    public void generateVampires(int vampireAmount){
    this.vampires.clear();
    for (int i = 0; i < vampireAmount; i++){
        this.vampires.add(new Vampire(this.length, this.height));
        }
    }

    public void turn(){
        char[] input = reader.nextLine().toLowerCase().toCharArray();
        for (int i = 0; i < input.length; i++) {
            this.player.move(input[i]);
            if (this.vampiresMove) {
                this.vampiresMove();
            }
            this.killVampire();
        }
    }
    
    public void displayMap(){
        for (int y = 0; y < this.height; y++){
            for (int x = 0; x < this.height; x++){
                OUTER:
                while (true) {
                    if (this.player.location().equals(x + "x" + y + "y")){
                        System.out.print("@");
                        break;
                    }
                    
                    for (int i = 0; i < this.vampires.size(); i++) {
                        if (this.vampires.get(i).location().equals(x + "x" + y + "y")){
                            System.out.print("v");
                            break OUTER;
                        }
                    }
                    System.out.print(".");
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void vampiresMove(){
        ArrayList<Vampire> backupVampireList = new ArrayList<Vampire>(this.vampires);
        while (true){
            for (Vampire vampire : this.vampires){
                vampire.move();
            }
            if (this.checkOverlap()){
                this.vampires = backupVampireList;
            }
            break;
        }
    }

    public void killVampire(){
        for (int i = 0; i < this.vampires.size(); i++){
            if (this.player.location().equals(this.vampires.get(i).location())){
                this.vampires.remove(i);
            }
        }
    }

    public boolean checkOverlap(){
        for (int i = 0; i < this.vampires.size() - 1; i++){
            for (int j = i + 1; j < this.vampires.size(); j++){
                if (this.vampires.get(i).location().equals(this.vampires.get(j).location())){
                    return true;
                }
            }
        }
        return false;
    }
}