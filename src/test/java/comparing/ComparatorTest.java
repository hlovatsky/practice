package comparing;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

 class ComparatorTest {

    @Test
    void testHumanByName() {
        Human human1 = new Human("Bob", 17);
        Human human2 = new Human("Jack", 15);
        assertTrue(HumanComparator.BY_NAME.compare(human1, human2) < 0);
    }

     @Test
     void testHumanByAge() {
         Human human1 = new Human("Bob", 17);
         Human human2 = new Human("Jack", 15);
         assertTrue(HumanComparator.BY_AGE.compare(human1, human2) > 0);
     }

     @Test
     void testSortingByName() {
         var humans = new ArrayList<>(List.of(new Human("Jack", 15), new Human("Paul", 19), new Human("Bob", 17)));
         humans.sort(HumanComparator.BY_NAME);
         assertEquals("Bob", humans.get(0).getName());
         assertEquals("Jack", humans.get(1).getName());
         assertEquals("Paul", humans.get(2).getName());
     }

     @Test
     void testSortingByAge() {
         var humans = new ArrayList<>(List.of(new Human("Jack", 15), new Human("Paul", 19), new Human("Bob", 17)));
         humans.sort(HumanComparator.BY_AGE);
         assertEquals(15, humans.get(0).getAge());
         assertEquals(17, humans.get(1).getAge());
         assertEquals(19, humans.get(2).getAge());
     }
}
