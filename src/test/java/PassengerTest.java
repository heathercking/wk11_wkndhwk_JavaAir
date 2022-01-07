import org.junit.Before;
import org.junit.Test;
import passenger.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Tom Jones", 1);
    }

    @Test
    public void hasName() {
        assertEquals("Tom Jones", passenger.getName());
    }

    @Test
    public void canSetName() {
        passenger.setName("Bob Jones");
        assertEquals("Bob Jones", passenger.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }

    @Test
    public void canSetNumberOfBags() {
        passenger.setNumberOfBags(2);
        assertEquals(2, passenger.getNumberOfBags());
    }

}
