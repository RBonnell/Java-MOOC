
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
public class Container {
    private int weightLimit;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int limit){
        this.weightLimit = limit;
        this.suitcases = new ArrayList();
    }
    
    public void addSuitcase(Suitcase newSuitcase){
        if (this.weighAllSuitcases() + newSuitcase.totalWeight() <= weightLimit){
            this.suitcases.add(newSuitcase);
        }
    }
    
    public String toString(){
        //x suitcases (y kg)
        return countAllSuitcases() + " suitcases (" + weighAllSuitcases() + " kg)";
    }
    
    public int countAllSuitcases(){
        return this.suitcases.size();
    }
    
    public int weighAllSuitcases(){
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases){
            totalWeight+=suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for (Suitcase suitcase : suitcases){
            for (Thing thing : suitcase.getThings()){
                System.out.println(thing);                
            }
        }
    }
}
