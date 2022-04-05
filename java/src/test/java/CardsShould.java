import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class CardsShould {

    @Test
    public void the_person_with_highest_card_wins() {
        Cards cards = new Cards();
        //assertThat(cards.playerWins(new ArrayList<>(), new ArrayList<>())).isEqualTo(null);
        assertEquals(cards.playerWins(new String[] {"3"}, new String[] {"1"}),"Player 1 wins 1 to 0!");
    }
}
