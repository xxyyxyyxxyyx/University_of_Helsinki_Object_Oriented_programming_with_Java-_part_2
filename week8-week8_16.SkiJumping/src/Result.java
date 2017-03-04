
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Result {
    private int length;
    private int[] result;
    private Random r = new Random();
    
    public Result(){
        this.length = r.nextInt(61)+60;
        this.result = new int[5];
        for(int i=0;i<5;i++){
            result[i] = r.nextInt(11)+10;
        }
    }
    
    public int getLength(){
        return this.length;
    }
    public String getResult(){
        return Arrays.toString(result);
    }
    
    public int totalPoints(){
        return this.length+validPoints();
    }

    private int validPoints() {
        int sumOfPoints = 0;
        Arrays.sort(result);
        for(int i=1;i<result.length-1;i++){
            sumOfPoints += result[i];
        }
        return sumOfPoints;
    }
}
