/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author 358721
 */
public class BulkTank {
    private double volume;
    private double capacity;
    
    public BulkTank(){
        this.volume = 0;
        this.capacity = 2000;
    }
    
    public BulkTank(double capacity){
        this.volume = 0;
        this.capacity = capacity;
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return this.volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    
    public void addToTank(double amount){
        if (amount > this.howMuchFreeSpace()){
            this.volume = this.capacity;
        }
        else{
            this.volume += amount;
        }
    }
    public double getFromTank(double amount){
        double taken = 0;
        if (amount > this.getVolume()){
            taken = this.getVolume();
            this.volume -= taken;
            return taken;
        }
        else{
            taken = amount;
            this.volume -= taken;
            return taken;
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(Math.ceil(this.getVolume())).append("/").append(Math.ceil(this.getCapacity()));
        return sb.toString();
    }
}
