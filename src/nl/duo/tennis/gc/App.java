package nl.duo.tennis.gc;

public class App {

    public static void main(String[] args) throws InterruptedException {

        Player player = new Player();
        player.demo();
        player.clearTheCourt();

        System.gc(); // Zo bel je de GC met het verzoek om op te ruimen.

        Thread.sleep(10000);

    }
}
