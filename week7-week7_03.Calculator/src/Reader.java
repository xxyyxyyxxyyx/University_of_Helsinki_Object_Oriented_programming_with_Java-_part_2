/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class Reader {
    private Scanner in;
    
    public Reader(){
        in = new Scanner(System.in);
    }
    public String readString(){
        String input = in.nextLine();
        return input;
         }
    
    public int readInteger(){
        int input = Integer.parseInt(in.nextLine());
        return input;
    
    }
}
