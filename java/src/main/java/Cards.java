import java.util.ArrayList;

public class Cards {
    private final String CARDS = "123456789TJQK";

    public Cards() {
    }

    public String playerWins(String[] player1Cards, String[] player2Cards) {
        String player1Card = player1Cards[0];
        String player2Card = player2Cards[0];
        if (this.CARDS.indexOf(player1Card) > this.CARDS.indexOf(player2Card)) {
            return "Player 1 wins 1 to 0!";
        }
        return "Player 2 wins 0 to 1!";
    }
}
