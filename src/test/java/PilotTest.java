import org.junit.Before;
import org.junit.Test;
import staff.Pilot;
import staff.Rank;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Sully", Rank.CAPTAIN, "SS123");
    }

    @Test
    public void hasName() {
        assertEquals("Sully", pilot.getName());
    }

    @Test
    public void canSetName() {
        pilot.setName("Bob");
        assertEquals("Bob", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canSetRank() {
        pilot.setRank(Rank.FIRST_OFFICER);
        assertEquals(Rank.FIRST_OFFICER, pilot.getRank());
    }

    @Test
    public void hasPilotLicenceNum() {
        assertEquals("SS123", pilot.getPilotLicenceNum());
    }

    @Test
    public void canSetPilotLicenceNum() {
        pilot.setPilotLicenceNum("AA123");
        assertEquals("AA123", pilot.getPilotLicenceNum());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("Whoosh!", pilot.flyPlane());
    }
}
