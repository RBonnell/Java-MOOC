package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 358721
 */
public class Box implements Thing{
    private int maxCapacity;
    private List<Thing> things;
    
    public Box(int capacity){
        this.maxCapacity = capacity;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if (this.getVolume() + thing.getVolume() <= this.maxCapacity){
            things.add(thing);
            return true;
        }
        return false;
    }
    
    @Override
    public int getVolume(){
        int volume = 0;
        for(Thing thing : things){
            volume += thing.getVolume();
        }
        return volume;
    }
}
