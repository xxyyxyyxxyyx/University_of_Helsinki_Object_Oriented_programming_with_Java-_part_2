
public class Planes {
    
   private String planeID;
    private int capacity;
    
    public Planes(String planeID, int capacity){
        this.planeID = planeID;
        this.capacity = capacity;
    }
    
    public String getID(){
        return this.planeID;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    @Override
    public String toString(){
        return this.planeID + " (" + this.capacity + " ppl)";
    }
}
