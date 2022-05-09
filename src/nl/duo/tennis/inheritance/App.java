package nl.duo.tennis.inheritance;


public class App {

    public static void main(String[] args) {
        Dog hond = new Dog("Wodan");

        System.out.println(hond.getName());
        hond.eat();
    }
}
