
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Storehouse {
    
    
            private Map<String,Integer> myMap;
            private Map<String,Integer> myMapp;
           
            
            public  Storehouse(){
                myMap = new HashMap<String,Integer>();
                myMapp = new HashMap<String,Integer>();
            }
            
            public void addProduct(String product, int price, int stock){
                myMapp.put(product, stock);
                 myMap.put(product, price);
                 
            }
            
            public int price(String product){
                if(myMap.containsKey(product)){
                return myMap.get(product);
                }
                else{
                    return -99;
                }
            }
            
            public int stock(String product){
                if(myMapp.containsKey(product)){
                return myMapp.get(product);
                }
                else{
                    return 0;
                }
            }
            
            public boolean take(String product){
                if(myMapp.containsKey(product)){
                    myMapp.put(product, myMapp.get(product)-1);
                    if(myMapp.get(product)<0){
                        myMapp.put(product, 0);
                        return false;
                    }
                    return true;
                }
                else{
                    return false;
                }
            }
            
            public Set<String> products(){
                
                return myMap.keySet();
            }
    
}
