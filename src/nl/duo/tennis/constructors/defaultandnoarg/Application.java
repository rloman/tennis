package nl.duo.tennis.constructors.defaultandnoarg;

public class Application {

    public static void main(String[] args) {
        Bunny konijn = new Bunny();

        Bunny anderKonijn = new Bunny("Rabbit");

        System.out.println(anderKonijn.getName());
    }
}
