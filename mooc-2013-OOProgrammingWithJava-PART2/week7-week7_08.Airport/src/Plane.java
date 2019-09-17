
/**
 *
 * @author 358721
 */
public class Plane {
    private String planeId;
    private int capacity;
    
    public Plane(String id, int capacity){
        this.planeId = id;
        this.capacity = capacity;
    }
    
    public String getId(){
        return this.planeId;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public String toString(){
        return this.planeId + " (" + this.capacity + " ppl)";
    }
}