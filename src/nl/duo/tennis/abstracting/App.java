package nl.duo.tennis.abstracting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {
//        Animal a = new Animal(); // vout want ik kan Animal niet meer INSTANTIEREN

        Hedgehog h = new Hedgehog();
        h.eat();

        Horse horse = new Horse();

        Animal p = new Parrit();

        List<Animal> animals = new LinkedList<>(); // of Arraylist Dus
        animals.add(h);
        animals.add(horse);
        animals.add(p);
        animals.remove(horse);

        AnimalFeeder.feed(animals);

        Object o = new Horse();
        // o.giveMilk();// vout want het is een Object
        o.toString(); // goed want het is een Object en die heeft toString
    }
}
