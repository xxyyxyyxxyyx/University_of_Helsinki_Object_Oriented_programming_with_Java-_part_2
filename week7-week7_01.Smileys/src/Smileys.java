
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("hello");
    }
    
    private static void printWithSmileys(String characterString){
        int numberOfCharacters = characterString.length();
        smileys(numberOfCharacters);
        System.out.println();
        
        if(numberOfCharacters%2==1){
            System.out.println(":) "+characterString+"  :)");
        }
        else{
              System.out.println(":) "+characterString+" :)");
        }
        smileys(numberOfCharacters);
        
        
    }
    
    private static void smileys(int numberOfCharacters){
        if(numberOfCharacters%2==0)
        for(int i=0;i<(numberOfCharacters/2)+3;i++){
            System.out.print(":)");
        }
        else{
            
        }
    
    }
}
