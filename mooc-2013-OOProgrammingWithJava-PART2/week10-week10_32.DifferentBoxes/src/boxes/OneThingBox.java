package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 358721
 */
public class OneThingBox extends Box{
    private List<Thing> onlyThing;
    
    public OneThingBox(){
        onlyThing = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(onlyThing.isEmpty()){
            onlyThing.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return onlyThing.contains(thing);
    }
}
