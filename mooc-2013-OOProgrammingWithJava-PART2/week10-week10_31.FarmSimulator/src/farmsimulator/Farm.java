package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 358721
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> herd;
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.herd = new ArrayList<Cow>();
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public void addCow(Cow cow){
        herd.add(cow);
    }
    
    public void manageCows(){
        barn.takeCareOf(herd);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : herd){
            cow.liveHour();
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Farm owner: ").append(owner).append("\nBarn bulk tank: ").append(
        barn.toString()).append("\n");
        if(herd.isEmpty()){
            sb.append("No cows.");
        }
        else{
            sb.append("Animals:\n");
            for(Cow cow : herd){
                sb.append("        ").append(cow).append("\n");
            }
        }
        return sb.toString();
    }
}
