import java.util.ArrayList;

public class Cards {
    private final String CARDS = "123456789JQK";

    public Cards() {
    }

    public String playerWins(char[] player1Cards, char[] player2Cards) throws Exception {
        if(player1Cards.length == 0 || player2Cards.length == 0) {
            throw new Exception("The minimum number of cards must be 1");
        }
        char player1Card = player1Cards[0];
        char player2Card = player2Cards[0];
        if(this.CARDS.indexOf(player1Card) == -1 || this.CARDS.indexOf(player2Card) == -1) {
            throw new Exception("One of the players use an unknown card");
        }
        if (this.CARDS.indexOf(player1Card) > this.CARDS.indexOf(player2Card)) {
            return "Player 1 wins 1 to 0!";
        } else if (this.CARDS.indexOf(player1Card) < this.CARDS.indexOf(player2Card)) {
            return "Player 2 wins 0 to 1!";
        }
        return "Draw!";
    }
}
