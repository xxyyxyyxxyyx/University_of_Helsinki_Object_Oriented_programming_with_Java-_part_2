/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
       this.tank = tank;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
    }
    
    public BulkTank getBulkTank(){
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot ){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow) {
        if(this.milkingRobot==null){
            throw new IllegalStateException();
        }
        else{
        this.milkingRobot.milk(cow);
        }
    }
    
    public void takeCareOf(Collection<Cow> cows) {
         if(this.milkingRobot==null){
            throw new IllegalStateException();
        }
        else{
             for(Cow cow: cows){
                 this.milkingRobot.milk(cow);
             }
        }
    }
    
    public String toString(){
        return this.tank.toString();
    } 
    
    
}
