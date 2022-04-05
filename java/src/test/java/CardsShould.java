import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;

public class CardsShould {

    Cards cards;

    @BeforeEach
    public void setUp() {
        cards = new Cards();
    }

    @Test
    public void the_person_with_highest_card_wins() throws Exception {
        assertEquals(cards.playerWins(new char[] {'3'}, new char[] {'1'}),"Player 1 wins 1 to 0!");
        assertEquals(cards.playerWins(new char[] {'1'}, new char[] {'3'}),"Player 2 wins 0 to 1!");
    }

    @Test
    public void the_minimum_number_of_cards_must_be_one() {
        Exception exception = assertThrows(Exception.class, () -> cards.playerWins(new char[] {'1'}, new char[] {}));
        String expectedMessage = "The minimum number of cards must be 1";
        assertEquals(expectedMessage, exception.getMessage());

        exception = assertThrows(Exception.class, () -> cards.playerWins(new char[] {}, new char[] {}));
        expectedMessage = "The minimum number of cards must be 1";
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void one_of_the_players_use_an_unknown_card() {
        Exception exception = assertThrows(Exception.class, () -> cards.playerWins(new char[] {'W'}, new char[] {'3'}));
        String expectedMessage = "One of the players use an unknown card";
        assertEquals(expectedMessage, exception.getMessage());
    }

    @Test
    public void draw_between_the_players() throws Exception {
        assertEquals(cards.playerWins(new char[] {'1'}, new char[] {'1'}),"Draw!");
    }

    @Test
    public void wins_the_player_with_the_highest_score() throws Exception {
        assertEquals(cards.playerWins(new char[] {'1','4'}, new char[] {'2','K'}),"Player 2 wins 0 to 2!");
        assertEquals(cards.playerWins(new char[] {'2','5','K'}, new char[] {'1','7','Q'}),"Player 1 wins 2 to 1!");
    }

    @Test
    public void one_of_the_players_has_less_cards() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> cards.playerWins(new char[] {'1','4'}, new char[] {'2','K','Q'}));
        String expectedMessage = "One of the players has less cards";
        assertEquals(expectedMessage, exception.getMessage());
    }
}
