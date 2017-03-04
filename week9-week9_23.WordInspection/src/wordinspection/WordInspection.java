/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WordInspection {
    private final String vowels = "aeiouyäö";
    private File myFile;
    private Scanner reader;
    public WordInspection(File file){
        myFile = file;
    }
    
    public int wordCount() throws Exception{
        reader = new Scanner(myFile);
        int count =0;
        while(reader.hasNext()){
            count++;
            reader.next();
        }
        return count;
    }
    
    public List<String> wordsContainingZ() throws Exception{
        List<String> list = new ArrayList<String>();
        reader = new Scanner(myFile);
        while(reader.hasNext()){
            String word = reader.next();
            if(word.contains("z")){
                list.add(word);
            }
        }
        return list;
    }
    
    public List<String> wordsEndingInL()throws Exception{
        List<String> list = new ArrayList<String>();
        reader = new Scanner(myFile);
        while(reader.hasNext()){
            String word = reader.next();
            if(word.charAt(word.length()-1)=='l'){
                list.add(word);
            }
        }
        return list;
    }
    
    public List<String> palindromes()throws Exception{
        List<String> list = new ArrayList<String>();
        reader = new Scanner(myFile);
        while(reader.hasNext()){
            String word = reader.next();
            String reversed = "";
            for(int i=0;i<word.length();i++){
                reversed += word.charAt(word.length()-1-i);
            }
            if(word.equals(reversed)){
                list.add(word);
            }
        }
        
        return list;
    }
    
    public void  wordsWhichContainAllVowels() throws Exception{
        for(char vowel:this.vowels.toCharArray()){
           
    }
}
}
