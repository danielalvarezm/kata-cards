import java.util.ArrayList;

public class Cards {
    private final String CARDS = "123456789JQK";

    public Cards() {
    }

    public String playerWins(char[] player1Cards, char[] player2Cards) throws Exception {
        int scorePlayer1 = 0;
        int scorePlayer2 = 0;
        if(player1Cards.length == 0 || player2Cards.length == 0) {
            throw new Exception("The minimum number of cards must be 1");
        }
        for(int i = 0; i < player1Cards.length; i++) {
            int player1Card = CARDS.indexOf(player1Cards[i]);
            int player2Card = CARDS.indexOf(player2Cards[i]);
            if(player1Card == -1 || player2Card == -1) {
                throw new Exception("One of the players use an unknown card");
            }
            if(player1Card > player2Card) {
                scorePlayer1++;
            }
            else if(player1Card < player2Card) {
                scorePlayer2++;
            }
        }
        if (scorePlayer1 > scorePlayer2) {
            return "Player 1 wins "+ scorePlayer1 + " to "+ scorePlayer2 + "!";
        } else if (scorePlayer1 < scorePlayer2) {
            return "Player 2 wins "+ scorePlayer1 + " to "+ scorePlayer2 + "!";
        }

        return "Draw!";
    }
}
