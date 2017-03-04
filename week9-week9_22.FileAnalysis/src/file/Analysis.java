/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Analysis {
    private File myFile;
    private Scanner reader;
    public Analysis(File file){
        myFile = file;
    }
    
    public int lines() throws Exception{
        int count =0;
        reader = new Scanner(myFile);
        while(reader.hasNextLine()){
            count++;
            reader.nextLine();
        }
        return count;
    }
    
    public int characters()throws Exception{
        reader = new Scanner(myFile);
        int count =0;
        
        while(reader.hasNextLine()){
            String word = reader.nextLine();
            for(int i=0;i<word.length();i++){
                count++;
            }
           }
        return count+this.lines();
    }
}
