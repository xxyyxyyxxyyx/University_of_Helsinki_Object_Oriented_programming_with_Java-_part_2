
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Printer {
    private File input;
    private Scanner reader;
    
    public Printer(String fileName)throws Exception{
        this.input = new File(fileName);
    }
    
    public void printLinesWhichContain (String word)throws Exception{
         reader = new Scanner(this.input);
        if(word.isEmpty()){
            
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
        }
        
        else{
            while(reader.hasNextLine()){
                    String line = reader.nextLine();
                    if(line.contains(word)){
                        System.out.println(line);
                    }
                }
        }
        }
      
}
