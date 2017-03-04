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
public class Changer {
    ArrayList<Change> array;
    
    public Changer()
    {
    this.array = new ArrayList<Change>();
    
    }
    
    public void addChange(Change change){
        this.array.add(change);
    }
    
    public String change(String characterString)
    {
       for(Change x: array){
           characterString = x.change(characterString);
       }
       return characterString;
    }
}
