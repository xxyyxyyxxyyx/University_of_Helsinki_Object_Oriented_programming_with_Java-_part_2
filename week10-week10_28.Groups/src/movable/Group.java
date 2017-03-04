/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Group implements Movable {
     private List<Movable> list;
     
     public Group(){
         list = new ArrayList<Movable>();
     }
     
     public String toString(){
         String output="";
         for(Movable items: list){
              output += items.toString()+"\n";
         }
         return output;
     }
     public void addToGroup(Movable movable){
         this.list.add(movable);
     }
    @Override
    public void move(int dx, int dy) {
       for(Movable items:list){
           items.move(dx, dy);
       }
    }
    
}
