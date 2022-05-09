package nl.duo.tennis.constructors.defaultandnoarg;

public class Bunny {

    private String name;
    // here you see the (hidden) default constructor
    // na onderstaande andere constructor dus
    // geen default constructor meer

    public Bunny(String name) {
        this.name = name;
    }

    // no-arg constructor
    public Bunny() {
    }

    public String getName() {
        return name;
    }
}
