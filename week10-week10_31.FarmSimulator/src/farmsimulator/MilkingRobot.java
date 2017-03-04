/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author user
 */
public class MilkingRobot {
    private BulkTank bulkTank;
    
    public MilkingRobot(){
      bulkTank = null;
    }
    
    public BulkTank getBulkTank(){
       return this.bulkTank;
    } 
    public void setBulkTank(BulkTank tank){
        bulkTank = tank;
    }
    
    public void milk(Milkable milkable){
        if(this.bulkTank==null){
            throw new IllegalStateException();
        }
        else{
        this.bulkTank.addToTank(milkable.milk());
    }
    }
}
