/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }
    @Override
    public void add(Thing thing) {
        if(thing.getWeight() == 0) things.add(thing);
        if(maxWeight - thing.getWeight() >= 0) things.add(thing);
        maxWeight -= thing.getWeight();
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(things.contains(thing)) return true;
        return false;
    }
    
}
