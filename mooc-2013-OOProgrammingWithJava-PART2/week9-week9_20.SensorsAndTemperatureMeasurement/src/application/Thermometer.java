/**
 *
 * @author 358721
 */

package application;

import java.util.Random;

public class Thermometer implements Sensor{
    private boolean status;
    
    public Thermometer(){
        this.status = false;
    }
    
    @Override 
    public boolean isOn(){
        return this.status;
    }
    
    @Override
    public void on(){
        this.status = true;
    }
    
    @Override
    public void off(){
        this.status = false;
    }
    
    @Override
    public int measure(){
        if (this.isOn()){
            return getRandomMeasurement(-30, 60);
        }
        throw new IllegalStateException("Thermometer must be turned on to measure");
    }
    
    private static int getRandomMeasurement(int minNum, int rangeofNums) {
        Random rand = new Random();
        return minNum + (rand.nextInt(rangeofNums + 1));
    }
}
