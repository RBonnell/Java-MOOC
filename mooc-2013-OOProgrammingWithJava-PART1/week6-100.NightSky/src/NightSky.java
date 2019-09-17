/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
import java.util.Random;

public class NightSky {
    private double density;
    private int height;
    private int width;
    private int starsInLastPrint;
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(int width, int height){
        this.density = 0.10;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;        
    }
    
    public void printLine(){
        Random rand = new Random();
        for (int i = 0; i < this.width; i++){
            double num = rand.nextDouble();
            if (num <= (density)){
                System.out.print("*");
                starsInLastPrint++;
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    public void print(){
        starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++){
            printLine();
        }
        
    }
    
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
