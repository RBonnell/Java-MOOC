/**
 *
 * @author 358721
 */

package application;

public class ConstantSensor implements Sensor{
    private int input;
    
    public ConstantSensor(int input){
        this.input = input;
    }
    
    @Override
    public boolean isOn(){
        return true;
    }
    
    @Override
    public void on(){
        
    }
    
    @Override
    public void off(){
        
    }
    
    @Override
    public int measure(){
        return this.input;
    }
}
