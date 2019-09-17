package moving.domain;

/**
 *
 * @author 358721
 */
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;
    
    public Item(String name, int volume){
        this.name = name;
        this.volume = volume;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getVolume(){
        return this.volume;
    }
    
    @Override
    public String toString(){
        return name + " (" + volume + " dm^3)";
    }
    
    @Override
    public int compareTo(Item item){
        return this.getVolume() - item.getVolume();
    }
   
}
