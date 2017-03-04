import java.util.Scanner;
public class TextUserInterface {
    private Scanner in;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        in = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
        System.out.print("Statement: ");;
        String input = in.nextLine();
        if(input.equals("quit")){
            System.out.println("Cheers!");
            break;
        }
         if(input.equals("add")){
            System.out.print("In Finnish: ");
            String finnish = in.nextLine();
            System.out.print("Translation: ");
            String english = in.nextLine();
            add(finnish,english);
            }
        if(input.equals("translate")){
            System.out.print("Give a word: ");
            String word = in.nextLine();
            System.out.println("Translation: "+translate(word));
        }
    }
    }
    
   public void add(String word, String word2){
       dictionary.add(word, word2);
   } 
   
   public String translate(String word){
       return dictionary.translate(word);
   }
}
