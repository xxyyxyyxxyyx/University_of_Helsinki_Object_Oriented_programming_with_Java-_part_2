
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Hand implements Comparable<Hand>{
    private List<Card> hand;
    
    public Hand(){
            hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        hand.add(card);
    }
    
    public void print(){
        for(Card card : hand){
            System.out.println(card.toString());
        }
    }
    
    public void sort(){
      Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand hand2) {
        int sumHand1 = 0;
        for(Card card: hand){
            sumHand1 += card.getValue();
        }
        
        int sumHand2 = 0;
        for(Card card: hand2.hand){
            sumHand2 += card.getValue();
        }
        
        return sumHand1 - sumHand2;
       
    }
    
    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue());
    }
}
