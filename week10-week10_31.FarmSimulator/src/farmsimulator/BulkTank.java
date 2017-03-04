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
public class BulkTank {
    private double capacity;
    private double volume = 0.0;
    
    public BulkTank(double capacity){
        this.capacity = capacity;
    }
    
    public BulkTank(){
        this(2000);
    }
    
    public double getCapacity(){
        return this.capacity;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return capacity - volume;
    }
    
    public void addToTank(double amount){
        if(amount>=this.howMuchFreeSpace()){
            volume += this.howMuchFreeSpace();
        }
        else{
            volume += amount;
        }
    }
    
    public double getFromTank(double amount){
        if(amount>= this.volume){
                volume = 0.0;
        }
        else{
            volume -= amount;
        }
        
        return amount;
    }
    
    @Override
    public String toString(){
        return Math.ceil(this.volume)+"/"+Math.ceil(this.capacity);
    }
}

