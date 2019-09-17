package farmsimulator;

/**
 *
 * @author 358721
 */
public class MilkingRobot {
    
    private BulkTank attached;
    
    public MilkingRobot(){
        
    }
    
    public BulkTank getBulkTank(){
        return this.attached;
        }
    
    public void setBulkTank(BulkTank tank){
        this.attached = tank;
    }
    
    public void milk(Milkable milkable){
        if (attached == null) {
            throw new IllegalStateException("Bulk tank must be connected to milk animals");
        }
        attached.addToTank(milkable.milk());
    }
}
