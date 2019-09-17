
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Suitcase {
    private int weightLimit;
    private ArrayList<Thing> things;
    
    public Suitcase(int limit){
        this.weightLimit = limit;
        this.things = new ArrayList();
    }
    
    public ArrayList<Thing> getThings(){
        return this.things;
    }
    
    public void addThing(Thing thing){
        if (totalWeight() + thing.getWeight() <= this.weightLimit){
            this.things.add(thing);
        }
    }
    
    public String toString(){
        if (totalWeight() > 0){
            if (things.size() > 1){
                return totalThings() + " things (" + totalWeight() + " kg)";
            }
            else if (things.size() == 1){
                return "1 thing (" + totalWeight() + " kg)";
            }
            
        }
        return "empty (0kg)";    
    }
    
    public int totalThings(){
        return this.things.size();
    }
    
    public int totalWeight(){
        int weight = 0;
        for (Thing thing : this.things){
            weight+=thing.getWeight();
        }
        return weight;
    }
    
    public void printThings(){
        for (Thing thing : this.things){
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing(){
        int heaviest = 0;
        Thing heaviestThing = null;
        for (Thing thing : this.things){
            if (thing.getWeight() > heaviest){
                heaviest = thing.getWeight();
                heaviestThing = thing;
            }
        }
        return heaviestThing;
    }
}
