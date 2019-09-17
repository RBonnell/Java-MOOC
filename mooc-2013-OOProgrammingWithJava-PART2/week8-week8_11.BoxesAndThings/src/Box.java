
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 358721
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private List<ToBeStored> items;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item){
        if(this.weight() + item.weight() < maxWeight){
            items.add(item);
        }
        else{
            System.out.println("Sorry, too full!");
        }
    }
    
    @Override
    public double weight(){
        double wt = 0;
        for(ToBeStored item : items){
            wt += item.weight();
        }
        return wt;
    }
    
    @Override
    public String toString(){
        
        return "Box: " + items.size() + " things, total weight " + this.weight() + " kg";
    }
}
