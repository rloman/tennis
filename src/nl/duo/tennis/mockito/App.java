package nl.duo.tennis.mockito;

import nl.duo.tennis.model.Player;

public class App {

    public static void main(String[] args) {
        PlayerService service = new PlayerService();

        Player p = service.getPlayerById(3);

        System.out.println(p);

    }
}
