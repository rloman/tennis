package nl.duo.tennis.string;

import nl.duo.tennis.model.Player;



public class App {

    public static void main(String[] args) {
        Player speler = new Player();
        speler.setName("John");

        System.out.println(speler.getName());
    }
}
