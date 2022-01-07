import org.junit.Before;
import org.junit.Test;
import staff.CabinCrewMember;
import staff.Rank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jo Jones", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Jo Jones", cabinCrewMember.getName());
    }

    @Test
    public void canSetName() {
        cabinCrewMember.setName("Bob");
        assertEquals("Bob", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canSetRank() {
        cabinCrewMember.setRank(Rank.FIRST_OFFICER);
        assertEquals(Rank.FIRST_OFFICER, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessagesToPassengers() {
        assertEquals("Anything from the trolley?!", cabinCrewMember.relayMessage("Anything from the trolley?!"));
    }
}
