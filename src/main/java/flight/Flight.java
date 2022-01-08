package flight;

import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;


public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private LocalTime departureTime;
    private Plane plane;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Random rand = new Random();

    public Flight(String flightNumber, String destination, String departureAirport, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.plane = null;
        this.pilots = new ArrayList<>();
        this.cabinCrew = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public int pilotCount() {
        return this.pilots.size();
    }

    public PlaneType getPlaneType() {
        return this.plane.getPlaneType();
    }

    public void addPlane(Plane plane) {
        this.plane = plane;
    }

    public int cabinCrewCount() {
        return this.cabinCrew.size();
    }

    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengerCount() < getPlaneCapacity()) {
            this.passengers.add(passenger);
            passenger.addFlight(this.flightNumber);
            int seatNum = rand.nextInt(2);
            passenger.setSeatNumber(seatNum += 1);
        }
    }

    public int getPlaneCapacity() {
        return this.plane.getCapacityFromEnum();
    }

    public int getPlaneTotalWeight() {
        return this.plane.getTotalWeightFromEnum();
    }

    public int getTotalAvailableSeats() {
        return this.getPlaneCapacity() - this.passengers.size();
    }
}
