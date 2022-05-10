package nl.duo.tennis.abstracting;

import java.util.ArrayList;
import java.util.List;

public class AnimalFeeder {
    // Kijk, nu kan ik als List zowel een ArrayList of een LinkedList doorsturen.
    // Dat is het voordeel van Polymorfism
    // hetzelfde geldt voor Animal. Dat kan ook een hond of kat zijn
    public static void feed(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.eat();
        }
    }
}
