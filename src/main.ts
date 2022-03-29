/* eslint-disable @typescript-eslint/no-empty-function */
export class Main {
  private cards = '123456789TJQK';
  constructor() {}

  public playerWins(player1: string[], player2: string[]): string {
    if (player1.length != player2.length) {
      return 'Error: Someone has less cards';
    }

    let player1Score = 0;
    let player2Score = 0;

    for (let i = 0; i < player1.length; i++) {
      const card1 = this.cards.indexOf(player1[i]);
      const card2 = this.cards.indexOf(player2[i]);
      if (card1 == -1 || card2 == -1) {
        return 'Error: Someone use an unknow card';
      }

      if (card1 > card2) {
        player1Score++;
      } else if (card1 < card2) {
        player2Score++;
      }
    }

    let result = `Draw ${player1Score} to ${player2Score}!`;

    if (player1Score > player2Score) {
      result = `Player 1 wins ${player1Score} to ${player2Score}!`;
    }

    if (player1Score < player2Score) {
      result = `Player 2 wins ${player1Score} to ${player2Score}!`;
    }

    return result;
  }
}
