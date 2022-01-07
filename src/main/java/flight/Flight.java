package flight;

import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;

import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;

    public Flight(String flightNumber, String destination, String departureAirport, String departureTime) {
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
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
