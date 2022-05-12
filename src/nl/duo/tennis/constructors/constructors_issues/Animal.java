package nl.duo.tennis.constructors.constructors_issues;

public class Animal {

    private String name;

    public Animal() {

    }
    
    public Animal(String name) {
        super(); // dit doet ie altijd automatisch
        this.name = name;
    }
}
