/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author user
 */
public class PromissoryNote {
       private HashMap<String,Double> loan;
       
    public PromissoryNote(){
       loan = new HashMap<String,Double>();
    }
    
    public void setLoan(String toWhom, double value){
             this.loan.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
    
        if(this.loan.containsKey(whose)){
            return this.loan.get(whose);
        }
        return 0;
    }
    
}
