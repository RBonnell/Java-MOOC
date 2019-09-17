
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 358721
 */
public class Jumper implements Comparable<Jumper>{
    private String name;
    private int points;
    private List<Integer> jumps;

    public Jumper(String name){
        this.name = name;
        this.jumps = new ArrayList<Integer>();
    }

    public void addJump(int points, int length){
        this.points += points;
        jumps.add(length);
    }

    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name + " (" + points + " points)";
    }

    @Override //due to implementing Comparable interface
    public int compareTo(Jumper jumper){
        return this.points - jumper.points;
        }

    public int getPoints(){
        return points;
    }

    public void printJumps(){
        System.out.print("            jump lengths: "); //12 spaces, no tabs
        
        int i = 1;
        for (Integer jump : jumps) {
            if (i < jumps.size()){
                System.out.print(jump + " m, ");
            }
            else{
                System.out.print(jump + " m");
            }
            i++;
        }
        System.out.print("\n");
    }
}
