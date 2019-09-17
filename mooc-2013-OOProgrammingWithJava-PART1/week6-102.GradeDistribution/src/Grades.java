
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
public class Grades {
    private ArrayList<Integer> grades;
    private int allScores = 0;
    private int accepted = 0;
    
    public Grades(){
         this.grades = new ArrayList<Integer>();
    }
    
    public void addGrade(int newGrade){
        this.grades.add(newGrade);
    }
    
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }
    
    public double calculateAcceptance(){
        if (allScores > 0){
        return ((100 * accepted) / allScores);
        }
        return 0;
    }
    
    public int[] tallyGrades(ArrayList<Integer> list){
        int[] tally = {0, 0, 0, 0, 0, 0};
        for(int grade : grades){
            allScores++;        
            if (grade >= 50)
            {
                tally[0]++;
                accepted++;
            }
            else if (grade >= 45)
            {
                tally[1]++;
                accepted++;
            }
            else if (grade >= 40)
            {
                tally[2]++;
                accepted++;
            }
            else if (grade >= 35)
            {
                tally[3]++;
                accepted++;
            }
            else if (grade >= 30)
            {
                tally[4]++;
                accepted++;
            }
            else if (grade < 30 && grade >= 0)
            {
                tally[5]++;
            }
        }
        return tally;
    }
            
    public void printStar(int tallyNo){
        for (int i = 0; i < tallyNo; i++){
            System.out.print("*");
        }
    }
}
