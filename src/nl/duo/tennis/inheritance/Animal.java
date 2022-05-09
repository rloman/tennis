package nl.duo.tennis.inheritance;

public class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Eating animal");
    }

    protected void animalOnly() {
        System.out.println("In animalOnly");
    }
}
