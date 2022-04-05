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
        //assertThat(cards.playerWins(new ArrayList<>(), new ArrayList<>())).isEqualTo(null);
        assertEquals(cards.playerWins(new char[] {'3'}, new char[] {'1'}),"Player 1 wins 1 to 0!");
        assertEquals(cards.playerWins(new char[] {'1'}, new char[] {'3'}),"Player 2 wins 0 to 1!");
    }

    @Test
    public void the_minimum_number_of_cards_must_be_one() {
        //assertThat(cards.playerWins(new ArrayList<>(), new ArrayList<>())).isEqualTo(null);
        //assertEquals(cards.playerWins(new char[] {}, new char[] {'3'}),"Player 1 wins 1 to 0!");
        //assertEquals(cards.playerWins(new char[] {}, new char[] {}),"Player 2 wins 0 to 1!");
        Exception exception = assertThrows(Exception.class, () -> cards.playerWins(new char[] {'1'}, new char[] {}));
        String expectedMessage = "The minimum number of cards must be 1";
        assertEquals(expectedMessage, exception.getMessage());

        exception = assertThrows(Exception.class, () -> cards.playerWins(new char[] {}, new char[] {}));
        expectedMessage = "The minimum number of cards must be 1";
        assertEquals(expectedMessage, exception.getMessage());
    }
}
