package nl.duo.tennis.equality;

import nl.duo.tennis.model.Ball;

public class App {

    public static void main(String[] args) {
        int a = 15;
        int b = 13;

        System.out.println(a == b); // vergelijk de inhoud. Dus 15 en 13 dus nee ...
        System.out.println(a == 15);

        String v = "Veter";
        String v2 = new String("Veter");

        System.out.println(v == v2);

        // equals // altijd gebruiken voor String vergelijking!!!
        System.out.println(v.equals(v2));

        Ball ball1 = new Ball();
        ball1.setColor(15);
        ball1.weight = 33;
        Ball ball2 = new Ball();
        ball2.setColor(15);
        ball2.weight = 33;

        System.out.println(ball1 == ball2); // zelfde referentie???
        System.out.println(ball1.equals(ball2)); // semantisch gelijk

    }
}
