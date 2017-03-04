/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author user
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private List<String> set;
    private int count;
    
    public PersonalDuplicateRemover(){
        set = new ArrayList<String>();
        count =0;
    }
    @Override
    public void add(String characterString) {
        if(!this.set.contains(characterString)){
            this.set.add(characterString);
        }
        else{
            count++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
       return this.count;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
           Set<String> output = new HashSet<String>();
           for(String string: this.set){
               output.add(string);
           }
           return output;
    }

    @Override
    public void empty() {
        this.set.clear();
        this.count =0;
        
    }
    
}
