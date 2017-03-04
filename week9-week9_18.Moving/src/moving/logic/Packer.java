/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author user
 */
public class Packer {
    private  List<Box> list ;
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        list = new ArrayList<Box>();
    }
    
    public List<Box> packThings(List<Thing> things){
          List<Box> boxes = new ArrayList<Box>();
    for (Thing t : things) {
            Box ml = new Box(boxesVolume);
            ml.addThing(t);
            boxes.add(ml);
        }
    
    return boxes;
    }
}
