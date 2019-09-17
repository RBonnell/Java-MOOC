package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author 358721
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int volume){
        this.boxesVolume = volume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> packed = new ArrayList<Box>();
        for (Thing thing : things){
            Box box = new Box(this.boxesVolume);
            box.addThing(thing);
            packed.add(box);
        }
        return packed;
    }
}
