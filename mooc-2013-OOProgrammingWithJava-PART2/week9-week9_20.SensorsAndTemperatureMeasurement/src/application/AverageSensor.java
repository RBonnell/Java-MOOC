/**
 *
 * @author 358721
 */

package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();
    
    @Override
    public boolean isOn(){
        for(Sensor sensor : sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void on(){
        for(Sensor sensor : sensors){
            sensor.on();
        }
    }
    
    @Override
    public void off(){
        for (Sensor sensor : sensors){
            if(sensor.isOn()){
                sensor.off();
                break;
            }
        }
    }
    
    @Override
    public int measure(){
        int total = 0;
        int avg = 0;
        
        if (sensors.isEmpty()){
            throw new IllegalStateException("Please add sensors to complete measurement");
        }
        
        else if (!this.isOn()){
            throw new IllegalStateException("Sensor must be turned on to complete measurement");
        }
        
        else if (this.isOn()){
            for (Sensor sensor : sensors){
                total += sensor.measure();
            }
        }
        avg = (total / sensors.size());
        readings.add(avg);
        return avg;
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public List<Integer> readings(){
        return readings;
    }
}
