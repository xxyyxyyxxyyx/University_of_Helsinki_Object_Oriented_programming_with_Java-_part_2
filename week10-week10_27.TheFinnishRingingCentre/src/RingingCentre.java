
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class RingingCentre {
    
    private Map<Bird,List<String>> map;
    
    
    public RingingCentre(){
        map = new HashMap<Bird,List<String>>();
    }
    
    
    public void observe(Bird bird, String place){
        if(map.containsKey(bird)){
            map.get(bird).add(place);
        }
        else{
        ArrayList<String> array = new ArrayList<String>();
        array.add(place);
        map.put(bird, array);
        }
    }
    
    public void observations(Bird bird){
       if(map.containsKey(bird)){
        System.out.println(bird.getLatinName()+" ("+bird.getRingingYear()+") observations: "+map.get(bird).size());
        for(String string: map.get(bird)){
            System.out.println(string);
        }
       }
       else{
               System.out.println(bird.getLatinName()+" ("+bird.getRingingYear()+") observations: "+0);

       }
        
    }
}
