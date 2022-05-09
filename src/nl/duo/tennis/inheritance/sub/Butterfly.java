package nl.duo.tennis.inheritance.sub;

import nl.duo.tennis.inheritance.Animal;
import nl.duo.tennis.inheritance.Dog;

public class Butterfly extends Animal {

    private Animal a = new Animal();
    private Dog d = new Dog("Wodan");

    public Butterfly() {
        this.animalOnly();
//        a.animalOnly(); // vout
//        d.animalOnly(); // vout
    }
}
