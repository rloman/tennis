package nl.duo.tennis.starter;


import nl.duo.tennis.model.Player;
import nl.duo.tennis.model.Racket;

public class Application {

    public static void main(String[] args) {
        // Class: nl.duo.tennis.model.Racket
        // Object: mijnTennisRacket van type 'nl.duo.tennis.model.Racket'
        Racket mijnTennisRacket = new Racket();

        // 500 hier is nu het 'argument'
        // en je knoopt dus eigenlijk 500 als argument
        // aan de parameter 'mijnGewicht' in de methode
        // setWeight
        mijnTennisRacket.setWeight(500);
        mijnTennisRacket.getWeight();

        Player sebastiaan = new Player();
        sebastiaan.playAMatch();
        System.out.println(sebastiaan.getAantalWedstrijdenGespeelt());
    }
}
