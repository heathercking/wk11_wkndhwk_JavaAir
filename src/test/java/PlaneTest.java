import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canSetPlaneType() {
        plane.setPlaneType(PlaneType.AIRBUSA320);
        assertEquals(PlaneType.AIRBUSA320, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, plane.getCapacityFromEnum());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(80, plane.getTotalWeightFromEnum());
    }



}
