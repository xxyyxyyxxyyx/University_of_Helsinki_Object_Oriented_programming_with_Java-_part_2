


public class Flight {

    private String departure;
    private String destination;
    private Planes plane;

    public Flight(Planes plane, String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
        this.plane = plane;
    }

    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
}
