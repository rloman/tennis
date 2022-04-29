package nl.duo.tennis.access;

public class DogMain {

    public static void main(String[] args) {
        Dog d = new Dog();

        Dog e = new Dog();
        Dog otje = new Dog();

        System.out.printf("Er zijn nu '%d' honden gecreerd", Dog.getDogCounter());

        System.out.println(otje.getDogCounter()); // beetje gek maar wel lekker
        System.out.println(Dog.getDogCounter()); // normaal
    }
}


