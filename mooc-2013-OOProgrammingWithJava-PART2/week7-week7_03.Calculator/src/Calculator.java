/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 358721
 */
public class Calculator {
    private Reader reader;
    private int calculations;
    
    public Calculator(){
        this.reader = new Reader();
        this.calculations = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
    
    private void sum(){
        int[] vals = getValues();
        System.out.println("sum of the values " + (vals[0] + vals[1]));
        calculations++;
    }
    
    private void difference(){
        int[] vals = getValues();
        System.out.println("difference of the values " + (vals[0] - vals[1]));
        calculations++;
    }
    
    private void product(){
        int[] vals = getValues();
        System.out.println("product of the values " + (vals[0] * vals[1]));
        calculations++;
    }
    private void statistics(){
        System.out.println("Calculations done " + calculations);
    }
    
    private int[] getValues(){
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();
        return values;
    }
    
}
