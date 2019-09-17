/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Counter {
    private int counter;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.counter = startingValue;
        this.check = check;
    }
    
    public Counter(int startingValue){
        this.counter = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check){
        this.counter = 0;
        this.check = check;        
    }
    
    public Counter(){
        this.counter = 0;
        this.check = false;
    }
    
    public int value(){
        return this.counter;
    }
    
    public void increase(){
        counter++;
    }
    
    public void increase(int increaseAmount){
        if (increaseAmount > 0){
        counter += increaseAmount;
        }
    }
    
    public void decrease(){
        if (this.check){
            if (this.counter >= 1){
                counter--;
            }
        }
        else{
            this.counter--;
        }
    }
    
    public void decrease(int decreaseAmount){
        if (decreaseAmount < 0){
            return;
        }
        else if (this.check){
            if ((this.counter - decreaseAmount)>= 0){
                counter -= decreaseAmount;
            }
            else{
                counter = 0;
            }
        }
        else{
                counter -= decreaseAmount;
        }
        
    }
}

