package nl.duo.tennis.formatting;

import nl.duo.tennis.inheritance.Animal;
import nl.duo.tennis.inheritance.Dog;

public class Bike extends Animal {

    private Animal a = new Animal();
    private Dog d = new Dog("Wodan");

    public Bike() {
        this.animalOnly();
        a.animalOnly();
        d.animalOnly();
    }
}
