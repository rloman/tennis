package nl.duo.tennis.abstracting;

import nl.duo.tennis.model.animals.*;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
//        Animal a = new Animal(); // vout want ik kan Animal niet meer INSTANTIEREN. is nu namelik abstract class

        Horse horse = new Horse();
        Animal parrit = new Parrit();

        Hedgehog hedgehog = new Hedgehog();
        hedgehog.eat();

        Mammal cow = new Cow();

        List<Animal> animals = new ArrayList<>();
        animals.add(hedgehog);
        animals.add(horse);
        animals.add(parrit);
        animals.add(cow); // let op: ja, een Cow is een Mammal en ook een Animal dus dit mag.
      
        AnimalFeeder.feed(animals);

        Object objectInstance = new Horse();
        // o.giveMilk();// vout want het is een Object

        objectInstance.toString(); // goed want het is een Object en die heeft toString
    }
}
