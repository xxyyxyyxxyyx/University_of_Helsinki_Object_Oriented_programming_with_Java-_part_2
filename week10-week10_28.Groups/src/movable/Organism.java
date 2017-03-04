/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author user
 */
public class Organism implements Movable{
    private int xCoordinate;
    private int yCoordinate;
    public Organism(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    
    @Override
    public String toString(){
        return "x: "+this.xCoordinate+"; "+"y: "+this.yCoordinate;
        
    }
    @Override
    public void move(int dx, int dy) {
        this.xCoordinate = this.xCoordinate+dx;
        this.yCoordinate = this.yCoordinate+dy;
    }
    
}
