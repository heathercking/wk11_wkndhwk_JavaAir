package passenger;

import person.Person;

public class Passenger extends Person {

    private int numberOfBags;
    private String flight;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.flight = "";
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public String getFlight() {
        return this.flight;
    }

    public void addFlight(String flightNumber) {
        this.flight = flightNumber;
    }
}
