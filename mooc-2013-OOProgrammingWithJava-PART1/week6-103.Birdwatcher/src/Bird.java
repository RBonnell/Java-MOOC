/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String Name, String LatinName){
        this.name = Name;
        this.latinName = LatinName;
        this.observations = 0;
    }
    public String GetName(){
        return this.name;
    }
    public String GetLatinName(){
        return this.latinName;
    }
    public void Observe(){
        this.observations++;
    }
    public int Observed(){
        return this.observations;
    }
}
