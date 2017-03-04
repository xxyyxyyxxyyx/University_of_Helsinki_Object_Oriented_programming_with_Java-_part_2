/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Calculator {

    private Reader read;
    private int statistics = 0;

    public Calculator() {
        read = new Reader();
        }

    private void sum() {
          System.out.print("Value1: ");
        int value1 = read.readInteger();
          System.out.print("Value2: ");
        int value2 = read.readInteger();
        int sum = value1 + value2;
        System.out.println("sum of values "+sum);
         statistics++;
        
    }

    private void difference() {
          System.out.print("Value1: ");
        int value1 = read.readInteger();
          System.out.print("Value2: ");
        int value2 = read.readInteger();
       int  difference = value1 - value2;
        System.out.println("difference of values "+difference);
        statistics++;

    }

    private void product() {
        
       int [] values = readTwoValues();
        int product = values[0] * values[1];
        System.out.println("product of the values "+product);
        statistics++;

    }

    private void statistics() {
        System.out.println("Calculations done " + statistics);

    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = read.readString();
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
    
    private int[] readTwoValues(){
        int[] values = new int[2];
        System.out.println("value1: ");
        values[0] = read.readInteger();
        System.out.println("value2: ");
        
       values[1] = read.readInteger();
       
       return values;
        
    }

}
