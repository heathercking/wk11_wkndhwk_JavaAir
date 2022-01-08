import flight.Flight;
import flight.FlightManager;
import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;
import plane.Plane;
import plane.PlaneType;
import staff.CabinCrewMember;
import staff.Pilot;
import staff.Rank;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
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
        flightManager = new FlightManager();
        plane = new Plane(PlaneType.BOEING747);
        pilot = new Pilot("Sully", Rank.CAPTAIN, "SS123");
        cabinCrewMember1 = new CabinCrewMember("Jo Jones", Rank.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Joe Smith", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Tom Jones", 1);
        passenger2 = new Passenger("Betty Jones", 1);
        passenger3 = new Passenger("Johnny Jones", 1);
        passenger4 = new Passenger("Bill Jones", 1);
        flight = new Flight("BA1234", "London", "Edinburgh", LocalTime.of(17,00));
    }

    @Test
    public void canGetPlaneTotalWeight() {
        flight.addPlane(plane);
        assertEquals(80, flightManager.getPlaneTotalWeight(flight));
    }

    @Test
    public void canGetPlaneCapacity() {
        flight.addPlane(plane);
        assertEquals(2, flightManager.getPlaneCapacity(flight));
    }

    @Test
    public void canCalculateBaggageWeightPerPassenger() {
        flight.addPlane(plane);
        assertEquals(20, flightManager.getIndividualBaggageAllowance(flight));
    }

    @Test
    public void canCalculateBookedBaggageWeight() {
        flight.addPlane(plane);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(40, flightManager.getBookedBaggageWeight(flight));
    }

    @Test
    public void canCalculateAvailableBaggageWeight() {
        flight.addPlane(plane);
        flight.addPassenger(passenger1);
        assertEquals(20, flightManager.getAvailableBaggageWeight(flight));
    }

}
