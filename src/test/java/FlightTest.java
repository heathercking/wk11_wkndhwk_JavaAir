import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;
import staff.Rank;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Sully", Rank.CAPTAIN, "SS123");
        cabinCrewMember1 = new CabinCrewMember("Jo Jones", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Joe Smith", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Tom Jones", 1);
        passenger2 = new Passenger("Betty Jones", 1);
        passenger3 = new Passenger("Johnny Jones", 1);
        passenger4 = new Passenger("Bill Jones", 1);
        flight = new Flight("BA1234", "London", "Edinburgh", "17:00");
    }


    @Test
    public void hasFlightNumber() {
        assertEquals("BA1234", flight.getFlightNumber());
    }

    @Test
    public void canSetFlightNumber() {
        flight.setFlightNumber("BA9999");
        assertEquals("BA9999", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("London", flight.getDestination());
    }

    @Test
    public void canSetDestination() {
        flight.setDestination("Bristol");
        assertEquals("Bristol", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void canSetFDepartureAirport() {
        flight.setDepartureAirport("Glasgow");
        assertEquals("Glasgow", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("17:00", flight.getDepartureTime());
    }

    @Test
    public void canSetDepartureTime() {
        flight.setDepartureTime("12:00");
        assertEquals("12:00", flight.getDepartureTime());
    }

    @Test
    public void canAddPilot() {
        flight.addPilot(pilot);
        assertEquals(1, flight.pilotCount());
    }

    @Test
    public void canAddPlane() {
        flight.addPlane(plane);
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void canAddCabinCrew() {
        flight.addCabinCrew(cabinCrewMember1);
        flight.addCabinCrew(cabinCrewMember2);
        assertEquals(2, flight.cabinCrewCount());
    }

    @Test
    public void canAddPassengers() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void canNotAddPassengerIfFullyBooked() {
        flight.addPlane(plane);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.passengerCount());
    }

    @Test
    public void canGetPlaneCapacity() {
        flight.addPlane(plane);
        assertEquals(2, flight.getPlaneCapacity());
    }

    @Test
    public void canGetPlaneTotalWeight() {
        flight.addPlane(plane);
        assertEquals(80, flight.getPlaneTotalWeight());
    }

    @Test
    public void canGetTotalAvailableSeats() {
        flight.addPlane(plane);
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getTotalAvailableSeats());
    }







}
