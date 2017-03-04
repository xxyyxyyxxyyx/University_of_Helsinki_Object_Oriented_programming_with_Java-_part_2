/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book implements ToBeStored {
    public String writer;
    public String name;
    public double  weight;
    public Book(String writer, String name, double weight){
    this.writer = writer;
    this.name = name;
    this.weight = weight;
}

    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return writer +": " + name ;
    }
    
    
    
}
