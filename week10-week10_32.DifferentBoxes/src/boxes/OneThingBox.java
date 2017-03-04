/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author user
 */
public class OneThingBox extends Box {
    private Thing oneThing;
    public OneThingBox(){
       oneThing = null;
    }

    @Override
    public void add(Thing thing) {
        if(oneThing == null) oneThing = thing;
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(oneThing == null || ! oneThing.equals(thing)) return false;
        return true;
    }
    
}
