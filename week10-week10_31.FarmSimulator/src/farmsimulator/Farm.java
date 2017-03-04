/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class Farm implements Alive{
    private String owner;
    private Barn myBarn;
    private ArrayList<Cow>myHerd;

    public Farm(String owner, Barn myBarn){
        this.owner = owner;
        this.myBarn = myBarn;
        myHerd = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow){
        myHerd.add(cow);
    }
    
    public void manageCows(){
        this.myBarn.takeCareOf(myHerd);
    }
    public String getOwner(){
        return this.owner;
    }
    
    @Override
    public String toString(){
        if(myHerd.isEmpty()){
            return "Farm owner: "+this.owner+"\nbarn bulk tank: "+this.myBarn.toString()+"\nNo cows.";
        }
        else{
              
            String output = "Farm owner: "+this.owner+"\nBarn bulk tank: "+this.myBarn.toString()+"\nAnimals: "; 
              
            for(Cow cow:this.myHerd){
                 output+= "\n        "+cow.toString();
              }
            return output;
        }
    }
    @Override
    public void liveHour() {
        for(Cow cow:this.myHerd){
            cow.liveHour();
        }
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.myBarn.installMilkingRobot(robot);
    }
    
    
}
