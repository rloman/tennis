public class Application {

    public static void main(String[] args) {
        // Class: Racket
        // Object: mijnTennisRacket van type 'Racket'
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
