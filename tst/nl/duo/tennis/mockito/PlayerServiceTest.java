package nl.duo.tennis.mockito;

import nl.duo.tennis.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PlayerServiceTest {

    @InjectMocks
    private PlayerService playerService;

    @Mock
    private PlayerRepository playerRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testGetPlayerById() {
        // Mocking
        {
            Player mock = new Player();
            mock.setName("Nadal");
            Mockito.when(this.playerRepository.getPlayer(3L)).thenReturn(mock);
        }

        Player p = playerService.getPlayerById(3L);
        Assertions.assertEquals("Nadal", p.getName());
    }
}
