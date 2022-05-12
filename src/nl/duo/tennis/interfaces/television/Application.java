package nl.duo.tennis.interfaces.television;

import java.util.LinkedList;
import java.util.Queue;

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

        Queue q = new LinkedList(); // ja, een LinkedList heeft dus ook de vorm: Queue
    }
}
