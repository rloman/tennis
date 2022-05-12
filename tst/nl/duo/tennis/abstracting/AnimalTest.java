package nl.duo.tennis.abstracting;

import nl.duo.tennis.model.animals.Animal;
import nl.duo.tennis.model.animals.Horse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    private Animal animal;

    public AnimalTest() {
        this.animal = new Horse();
    }

    @Test
    public void testSetAndGetName() {
        this.animal.setName("Jolly Jumper");

        Assertions.assertEquals("Jolly Jumper", this.animal.getName());
    }

    @Test
    public void testVerjaarAndGetAge() {
        Assertions.assertEquals(0, this.animal.getAge());

        this.animal.verjaar();

        Assertions.assertEquals(1, this.animal.getAge());
    }
}
