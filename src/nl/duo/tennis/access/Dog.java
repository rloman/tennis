package nl.duo.tennis.access;

public class Dog {

    private static int dogCounter = 0;

    private String name;

    public static int getDogCounter() {
        return dogCounter;
    }

    public Dog() {
        dogCounter++;
    }
}
