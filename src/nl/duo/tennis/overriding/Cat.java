package nl.duo.tennis.overriding;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println(" even better ... => Eating Cat and drinking milk");
    }
}
