package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author 358721
 */
public class ContainerHistory {
    private List<Double>capacityHistory;
    
    public ContainerHistory(){
        this.capacityHistory = new ArrayList<Double>();
    }
    
    public void add(double situation){
        capacityHistory.add(situation);
    }
    
    public void reset(){
        capacityHistory.clear();
    }
    
    public double maxValue(){
        return Collections.max(capacityHistory);
    }
    
    public double minValue(){
        return Collections.min(capacityHistory);
    }
    
    public double sum(){
        int total = 0;
        for (double num : capacityHistory){
            total += num;
        }
        return total;
    }
    
    public double average(){
        return this.sum() / capacityHistory.size();
    }
    
    public double greatestFluctuation() {

        if (this.capacityHistory.isEmpty() || this.capacityHistory.size() == 1){
            return 0;
        } 
        else {
            double greatest = 0;
            for (int i = 0; i < this.capacityHistory.size() - 1; i++){
                double fluctuation = Math.abs(this.capacityHistory.get(i) - this.capacityHistory.get(i + 1));

                if (fluctuation > greatest) {
                    greatest = fluctuation;
                }
            }
            return greatest;
        }
    }
    
    public double variance(){
        //see wikihow.com/calculate-variance and Java MOOC pt.1 wk 3 #67 'TheVariance'
        double dataSetMinusMean = 0;
        double avg = this.average();
        for (double num : capacityHistory){
            dataSetMinusMean += Math.pow((num - avg), 2);
        }
        double variance = (dataSetMinusMean / (capacityHistory.size() -1));
        return variance;
    }
    
    @Override
    public String toString(){
        return capacityHistory.toString();
    }
}