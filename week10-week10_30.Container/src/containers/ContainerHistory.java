/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ContainerHistory {
    private ArrayList<Double> object;
    
    public ContainerHistory(){
        object = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.object.add(situation);
    }
    
    public void reset(){
        this.object.clear();
    }
    
    public String toString(){
        return this.object.toString();
}
    public double maxValue(){
        
        if(this.object.isEmpty()){
            return 0;
        }
        else{
            double largest = this.object.get(0);
            for(Double members: this.object){
                if(members>largest){
                    largest = members;
                }
            }
            return largest;
        }
    }
    
    public double minValue(){
        
        if(this.object.isEmpty()){
            return 0;
        }
        else{
            double smallest = this.object.get(0);
            for(Double members: this.object){
                if(members<smallest){
                    smallest = members;
                }
            }
            return smallest;
        }
    }
    
    public double average(){
        
        if(this.object.isEmpty()){
            return 0;
        }
        else{
            double total = 0;
            for(Double members: this.object){
               
                    total+=members;
              
            }
            return total/this.object.size();
        }
    }
    
    public double greatestFluctuation(){
        if(this.object.isEmpty() || this.object.size()==1 ){
            return 0;
        }
        else{
             double greatestFluc = 0, fluc = 0, lastVal = object.get(0);
        for (double d : object) {
            fluc = Math.abs(lastVal - d);
            if (fluc > greatestFluc) {
                greatestFluc = fluc;
            }
            lastVal = d;
        }
        return greatestFluc;
        }
    }
    
    public double variance(){
        if(this.object.isEmpty() || this.object.size()==1 ){
            return 0;
        }
        else{
            Double average = this.average();
            Double sum = 0.0;
            for(Double members:this.object){
                sum += Math.pow((members-average), 2);
            }
            return sum/(this.object.size()-1);
        }
    }
}
