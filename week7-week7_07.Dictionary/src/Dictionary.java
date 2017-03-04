import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String,String> translate;
    
    public Dictionary(){
        translate = new HashMap<String,String>();
    }
    
    public String translate(String word){
        if(this.translate.containsKey(word)){
            return this.translate.get(word);
        }
        return null;
    }
    
    public void add(String word,String translation){
        if(this.translate.containsKey(word)){
            System.out.println("The word is already in the dictionary");
        }
        else this.translate.put(word, translation);
    }
    
    public int amountOfWords(){
        return this.translate.size();
    }
    
    public ArrayList<String> translationList(){
             ArrayList<String> output = new ArrayList<String>(this.translate.values());
             int i = 0;
             for(String key : translate.keySet()){
                 output.set(i, output.get(i)+" = "+key);
                 i++;
             }
             return output;
    }
}
