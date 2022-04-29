package nl.duo.tennis.overloading;

public class App {

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.drive(5);

        System.out.println(c.getMileage());

        System.out.println(6 == c.getMileage());
    }
}
