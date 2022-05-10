package nl.duo.tennis.abstracting;

import java.util.ArrayList;
import java.util.List;

public class AnimalFeeder {

    public static void feed(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.eat();
        }
    }
}
