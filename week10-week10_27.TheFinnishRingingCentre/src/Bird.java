
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getRingingYear(){
        return this.ringingYear;
    }
    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object bird){
        Bird compared = (Bird) bird;
        if(this.latinName.equals(compared.getLatinName()) && this.ringingYear==compared.getRingingYear()){
            return true;
        }
        return false;
    }
    
    public int hashCode(){
        return this.ringingYear+this.latinName.hashCode();
    }
}


