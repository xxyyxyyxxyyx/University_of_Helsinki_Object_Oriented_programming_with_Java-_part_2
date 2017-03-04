/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author user
 */
public class Thermometer implements Sensor{
    private Random ran = new Random();
    private boolean state;
    
    public Thermometer(){
        this.state = false;
    }
    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if(this.isOn()==false){
            throw new IllegalStateException();
        }
        else{
            int out = ran.nextInt(60)-30;
            return out;
        }
    }
    
    
}
