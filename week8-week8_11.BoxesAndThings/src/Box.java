
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Box implements ToBeStored{
    private ArrayList<ToBeStored > things;
    private double maxWeight;
    private double weight=0;
    
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        things = new  ArrayList<ToBeStored>();
      }
    
    public void add(ToBeStored things){
        this.weight = this.weight + things.weight();
        if(this.weight<=maxWeight){
            this.things.add(things);
        }
        else{
            this.weight -= things.weight();
        }
    }

    @Override
    public String toString() {
        return "Box: "+this.things.size()+" things, total weight "+this.weight+" kg";
    }

    @Override
    public double weight() {
            double returnWeight = 0;
            for(ToBeStored thing: things){
                returnWeight = returnWeight + thing.weight();
            }
            
            return returnWeight;
    }
    
    
}
