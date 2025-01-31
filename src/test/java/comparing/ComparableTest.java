package comparing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ComparableTest {

    @Test
    void testComparable() {
        Person person1 = new Person("Bob");
        Person person2 = new Person("John");
        assertTrue(person1.compareTo(person2) < 0);

        Person person3 = new Person("John");
        Person person4 = new Person("Bob");
        assertTrue(person3.compareTo(person4) > 0);

        Person person5 = new Person("John");
        Person person6 = new Person("John");
        assertEquals(0, person5.compareTo(person6));
    }
}