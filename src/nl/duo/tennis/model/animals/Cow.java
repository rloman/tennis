package nl.duo.tennis.model.animals;

public class Cow extends Mammal {

    @Override
    public void eat() {
        System.out.println("Eating corn and grass");
    }

    @Override
    public void giveMilk() {
        System.out.println("Cow giving Milk. Well giving ... we have to extract it ... ");
    }
}
