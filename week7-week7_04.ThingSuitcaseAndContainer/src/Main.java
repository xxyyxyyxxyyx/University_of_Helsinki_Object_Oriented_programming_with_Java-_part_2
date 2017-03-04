
public class Main {

    public static void main(String[] args) {
         Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        for(int weight=1;weight<100;weight++){
            Thing brick = new Thing("brick",weight);
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    
    }

}
