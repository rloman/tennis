package nl.duo.tennis.model.animals;

public abstract class Animal {

    private String name;
    private int age;

    // hier staan wellicht meerdere fields en methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void verjaar() {
        this.age++;
    }

    public abstract void eat();
}
