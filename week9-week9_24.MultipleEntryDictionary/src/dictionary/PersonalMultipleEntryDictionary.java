/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author user
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> list;
    public PersonalMultipleEntryDictionary(){
        list = new HashMap<String, Set<String>>();
    }
    @Override
    public void add(String word, String entry) {
        // create a new entry if the word is not already present
        if(!list.containsKey(word)){
            this.list.put(word, new HashSet<String>());
        }
        Set<String> entries = this.list.get(word);
        entries.add(entry);
        //this.list.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> output = new HashSet<String>();
        if(!this.list.containsKey(word)){
            return null;
        }
        else{
            for(String string: this.list.get(word)){
                output.add(string);
            }
        }
        return output;
    }

    @Override
    public void remove(String word) {
        this.list.remove(word);
    }
    
}
