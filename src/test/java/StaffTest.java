import org.junit.Before;
import org.junit.Test;
import staff.Rank;
import staff.Staff;

import static org.junit.Assert.assertEquals;

public class StaffTest {

    Staff staff;

    @Before
    public void before() {
        staff = new Staff("Sully", Rank.CAPTAIN);
    }

    @Test
    public void hasName() {
        assertEquals("Sully", staff.getName());
    }

    @Test
    public void canSetName() {
        staff.setName("Bob");
        assertEquals("Bob", staff.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.CAPTAIN, staff.getRank());
    }

    @Test
    public void canSetRank() {
        staff.setRank(Rank.FIRST_OFFICER);
        assertEquals(Rank.FIRST_OFFICER, staff.getRank());
    }
}
