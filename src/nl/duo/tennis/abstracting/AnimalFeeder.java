package nl.duo.tennis.abstracting;

import nl.duo.tennis.model.animals.Animal;
import nl.duo.tennis.model.animals.Horse;
import nl.duo.tennis.model.animals.Mammal;

import java.util.List;

public class AnimalFeeder {
    // Kijk, nu kan ik als List zowel een ArrayList of een LinkedList doorsturen.
    // Dat is het voordeel van Polymorfism
    // hetzelfde geldt voor Animal. Dat kan ook een hond of kat zijn
    public static void feed(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.eat();

            if (animal instanceof Horse) {
                Horse h = (Horse) animal;
                h.giveMilk();
            }
            // of eigenlijk nog beter. Want dan werkt het ook voor een Cow
            if (animal instanceof Mammal) {
                Mammal m = (Mammal) animal;
                m.giveMilk();
            }
        }
    }
}
