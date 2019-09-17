package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 358721
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public int getWeight(){
        int total = 0;
        if (things.isEmpty()){
            return 0;
        }
        for (Thing thing : things){
            total += thing.getWeight();
        }
        return total;
    }
    
    @Override
    public void add(Thing thing) {
        if (!(thing.getWeight() + this.getWeight() > this.maxWeight)){
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return things.contains(thing);
    }
    
}
