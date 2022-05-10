package nl.duo.tennis.abstracting;

import java.util.ArrayList;

public class AnimalFeeder {

    public static void feed(ArrayList<Animal> animals) {
        for(Animal animal : animals) {
            animal.eat();
        }
    }
}
