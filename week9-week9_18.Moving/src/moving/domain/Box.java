/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Box implements Thing{
    private int maxCap;
    private List<Thing> list;
    
    public Box(int maximumCapacity){
        maxCap = maximumCapacity;
        list = new ArrayList<Thing>(maxCap);
    }
    public boolean addThing(Thing thing){
        if(this.getVolume()+thing.getVolume()<=maxCap){
            list.add(thing);
            return true;
        }
        return false;
        
    }

    @Override
    public int getVolume() {
        int sum=0;
        for(Thing thing:list){
            sum += thing.getVolume();
        }
        return sum;
        
    }
}
