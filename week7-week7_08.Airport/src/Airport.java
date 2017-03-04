import java.util.ArrayList;
import java.util.Scanner;

public class Airport {
    private ArrayList<Planes> planes;
    private ArrayList<Flight> flights;
    private Scanner scanner;
   
    public Airport(Scanner scanner){
        this.planes = new ArrayList<Planes>();
        this.flights = new ArrayList<Flight>();
        this.scanner = scanner;
        
    }
    //Starts the first panel of ui
    public void start(){
        airportPanel();
        flightService();
    }

    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while(true){
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
        
        String operation = scanner.nextLine();
        if(operation.equals("1")){
        addPlane();
        }
        else if (operation.equals("2")){
            addFlight();
        }
        else if (operation.equals("x")){
            break;
        }
        }
    }

    private void flightService() {
        while(true){
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
        
        String operation = scanner.nextLine();
        if(operation.equals("1")) printPlanes();
        else if(operation.equals("2")) printFlights();
        else if(operation.equals("3")) printPlaneInfo();
        else if(operation.equals("x")) break;
        }
    }

    private void addPlane() {
         System.out.print("Give plane ID: ");
         String planeID = scanner.nextLine();
         System.out.print("Give plane capacity: ");
         int capacity = Integer.parseInt(scanner.nextLine());
         
         Planes newPlane = new Planes(planeID,capacity);
         planes.add(newPlane);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine();
        System.out.print("Give departure airport code: ");
        String departureAirportCode = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destinationAiportCode = scanner.nextLine();
        
        Planes plane = getPlane(planeID);
        Flight newFlight = new Flight(plane,departureAirportCode,destinationAiportCode);
        this.flights.add(newFlight);
    }

    private void printPlanes() {
        for(Planes plane: planes){
            System.out.println(plane);
        }
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = scanner.nextLine();
        Planes plane = getPlane(planeID);
        System.out.println(plane);
        
    }

    private void printFlights() {
        for(Flight flight:flights){
            System.out.println(flight);
        }
    }

    private Planes getPlane(String planeID) {
        for(Planes plane : planes){
            if(plane.getID().equals(planeID)){
                return plane;
            }
        }
        return null;
    }
}
