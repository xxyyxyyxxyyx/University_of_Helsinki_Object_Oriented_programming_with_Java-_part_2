/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;



/**
 *
 * @author user
 */
public class Cow implements Milkable,Alive{
    private String name;
    private int udderCapacity;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private double milkProvision;
    
    public Cow(String name){
        this.name = name;
        udderCapacity = 15+ new Random().nextInt(26);
        milkProvision = 0.0;
    }
    
    public Cow(){
        this(NAMES[new Random().nextInt(NAMES.length)]);
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return udderCapacity;
    }

    @Override
    public double milk() {
        double milked = this.milkProvision;
        this.milkProvision = 0.0;
        return milked;
    }

    @Override
    public void liveHour() {
       
        milkProvision += 0.7+ new Random().nextDouble()*1.3;
        if(milkProvision>=this.udderCapacity){
            milkProvision = this.udderCapacity;
        }
       }
    
    public double getAmount(){
        return this.milkProvision;
    }
    
    public String toString(){
        return this.name+" "+Math.ceil(milkProvision)+"/"+Math.ceil(udderCapacity);
    }
}
