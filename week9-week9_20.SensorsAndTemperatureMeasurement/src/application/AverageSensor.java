/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class AverageSensor implements Sensor{
    private List<Sensor> list;
    private List<Integer> readings = new ArrayList<Integer>();
    
    public AverageSensor(){
        this.list = new ArrayList<Sensor>();
    }
    public void addSensor(Sensor additional){
        list.add(additional);
    }
    @Override
    public boolean isOn() {
        for(Sensor sensor:list){
            if(sensor.isOn()==false){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor:list){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor:list){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if(this.isOn()==false||list.size()==0){
            throw new IllegalStateException();
        }
        else{
            int sum = 0;
            int count = this.list.size();
            for(Sensor sensor:this.list){
                sum += sensor.measure();
           
            }
            this.readings.add(sum/count);
            return sum/count;
        }
    }
    
    public List<Integer> readings(){
        return this.readings;
    }
    
}
