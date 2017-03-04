package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) throws IllegalArgumentException{
        if(weight < 0) throw new IllegalArgumentException();
        this.name = name;
        this.weight = weight;
    } 
    public Thing(String name)throws IllegalArgumentException{
        this(name,0);
    }
    public boolean equals(Object object){
        Thing otherThing = (Thing) object;
        if(!this.name.equals(otherThing.name)) return false;
        return true;
    }
    
    public int hashCode(){
        return name.hashCode();
    }
    
   

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

}
