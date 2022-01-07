package passenger;

import person.Person;

public class Passenger extends Person {

    private int numberOfBags;
    private String flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.flight = "";
        this.seatNumber = 0;
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

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
