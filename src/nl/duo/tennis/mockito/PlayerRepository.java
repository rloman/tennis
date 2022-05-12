package nl.duo.tennis.mockito;

import nl.duo.tennis.model.Player;

public interface PlayerRepository {

    Player getPlayer(long id);
}
