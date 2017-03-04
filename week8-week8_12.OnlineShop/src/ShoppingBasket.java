
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class ShoppingBasket {
    private Map<String, Purchase> myMap;
    
    public ShoppingBasket(){
        myMap = new HashMap<String,Purchase>();
    }
    
    public void add(String product, int price){
        
        if(myMap.containsKey(product)){
            myMap.get(product).increaseAmount();
            
            
        }
        
        else{
        Purchase buy = new Purchase(product,1,price);
        
        myMap.put(product,buy);
        }
        
         
    }
    
    public int price(){
        int sum = 0;
        Collection<Purchase> values = myMap.values();
        for(Purchase goods: values){
            sum += goods.price();
        }
        return sum;
    }
    
    public void print(){
    
        Collection<Purchase> values = myMap.values();
        for(Purchase goods : values){
              System.out.println(goods.toString());
        }
    
    }
}
