package test;

import com.pa.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testGetName() {
        Person p1 = new Person(1, "Tiago");
        assertEquals("Tiago", p1.getName());
    }

    @Test
    public void testGetId() {
        Person p2 = new Person(2, "Tiago");
        assertEquals(2, p2.getId());
    }

    @Test
    public void testSetId() {
        Person p3 = new Person(6, "Simão");
        p3.setId(3);
        assertEquals(3, p3.getId());
    }
}
