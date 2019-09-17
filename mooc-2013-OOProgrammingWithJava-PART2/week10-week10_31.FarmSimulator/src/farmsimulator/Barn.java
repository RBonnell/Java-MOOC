package farmsimulator;

import java.util.Collection;

/**
 *
 * @author 358721
 */
public class Barn {
    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        this.bulkTank = tank;
    }
    
    public BulkTank getBulkTank(){
        return this.bulkTank;
    }
    
    public void installMilkingRobot(MilkingRobot robot){
        robot.setBulkTank(this.bulkTank);
        this.milkingRobot = robot;
    }
    
    public void takeCareOf(Cow cow){
        try{
            this.milkingRobot.milk(cow);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Milking robot must be installed to milk animal");
        }
    }
    
    public void takeCareOf(Collection<Cow> cows){
        for(Cow cow : cows){
            takeCareOf(cow);
        }        
    }
    
    @Override
    public String toString(){
        return bulkTank.toString();
    }
}
