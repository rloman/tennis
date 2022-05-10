package nl.duo.tennis.abstracting;

public abstract class Animal {

    private String name;

    // hier staan wellicht meerdere fields en methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
