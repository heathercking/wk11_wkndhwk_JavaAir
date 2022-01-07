import org.junit.Before;
import org.junit.Test;
import person.Person;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Tom Jones");
    }

    @Test
    public void hasName() {
        assertEquals("Tom Jones", person.getName());
    }

    @Test
    public void canSetName() {
        person.setName("Bob Jones");
        assertEquals("Bob Jones", person.getName());
    }

}
