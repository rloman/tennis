package nl.duo.tennis.model.animals;

public class Horse extends Mammal {

    @Override
    public void eat() {
        System.out.println("Eating oat");
    }

    @Override
    public void giveMilk() {
        System.out.println("Horse giving Milk");
    }
}
