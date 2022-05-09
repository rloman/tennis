package nl.duo.tennis.constructors.defaultandnoarg;

public class Bunny {

    private String name;
    private double weight;
    // here you see the (hidden) default constructor
    // na onderstaande andere constructor dus
    // geen default constructor meer

    public Bunny(String name) {
        this(100);
        this.setName(name);
    }

    public Bunny(double weight) {
        this.setWeight(weight);
    }

    public Bunny(String name, double weight) {
        this(name); // constructor call!!!
        this.setWeight(weight); // setter
    }

    // no-arg constructor
    public Bunny() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
