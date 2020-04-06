import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {

    @Test
    public void testPersonCreation() {
        String firstNameAndLastName = "Piotr;Ivanov";
        Person p = Person.createPerson(firstNameAndLastName);
        assertNotNull(p);
        assertEquals("first name", "Piotr", p.getFirstName());
        assertEquals("last name", "Ivanov", p.getLastName());
    }

}
