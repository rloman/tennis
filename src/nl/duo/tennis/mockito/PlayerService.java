package nl.duo.tennis.mockito;

import nl.duo.tennis.model.Player;

public class PlayerService {

    private PlayerRepository playerRepository;

    public Player getPlayerById(long id) {

        Player resultOfService = this.playerRepository.getPlayer(id);
//        resultOfService.setName("David"); // als je dit aanzet is de service dus fout!!! en valt de
        // unittest PlayerServiceTest om

        return resultOfService;
    }

}
