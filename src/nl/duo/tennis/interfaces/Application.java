package nl.duo.tennis.interfaces;

public class Application {

    // Maak hier een TV en zet hem aan, zet op kanaal 3 en zet uit.

    public static void main(String[] args) {
        Samsung s = new Samsung();

        s.on();
        s.switchChannel(3);
        s.off();

        // Mooier is ...
        Television tv = new Samsung();

        tv.on();
        tv.switchChannel(5);
        tv.off();
    }
}
