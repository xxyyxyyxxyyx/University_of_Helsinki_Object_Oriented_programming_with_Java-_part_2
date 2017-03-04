/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class Container {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight){
        maximumWeight = maxWeight;
        suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
       int totalWeight=0;
           for(Suitcase x: suitcases){
               totalWeight+= x.totalWeight();
           }
           if(suitcase.totalWeight()+totalWeight<=maximumWeight){
               suitcases.add(suitcase);
           }
    }
    
    public String toString(){
        int totalItems =0;
        int totalWeight =0;
        for(Suitcase x: suitcases){
            totalWeight += x.totalWeight();
            totalItems++;
        }
        
        return totalItems+" suitcases "+"("+totalWeight+" kg)";
    }
    
    public void printThings(){
        for(Suitcase suitcase: suitcases){
             suitcase.printThings();
        }
    }
}
