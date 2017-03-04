/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;


public class Suitcase {
       private  ArrayList<Thing> things;
       private int weightLimit;
       
       
       public Suitcase(int weightLimit){
          this.weightLimit = weightLimit;
          this.things = new ArrayList<Thing>();
       }
       
       
       
       public void addThing(Thing thing){
    
           
           if(this.totalWeight()+thing.getWeight()<=weightLimit){
               this.things.add(thing);
           }
       }
       
       public String toString(){
           int totalWeight=0;
           int items = 0;
           for(Thing values: this.things){
               totalWeight+= values.getWeight();
               items++;
               
           }
           if(items==0){
               return "empty "+" ("+totalWeight+" kg)";
           }
           else if(items==1){
                return items+" thing "+" ("+totalWeight+" kg)";

           }
           else
           return items+" things "+" ("+totalWeight+" kg)";
       }
       
       public void printThings(){
        int totalWeight=0   ;
       for(Thing thing: things){
           System.out.println(thing.getName() +" ("+thing.getWeight()+" kg)");
 
       }
       }
       
       public int totalWeight(){
           int totalWeight=0;
           for(Thing thing:things){
               totalWeight += thing.getWeight();
           }
           return totalWeight;
       }
       
       public Thing heaviestThing(){
           Thing heaviest = null;
                for(Thing thing:things){
                    if(thing.getWeight()>heaviest.getWeight()){
                        heaviest = thing;
                    }
                }
                return heaviest;
       }
    
}
