/* eslint-disable @typescript-eslint/no-empty-function */
export class Main {
  private cards = '123456789TJQK';
  constructor() {}

  public playerWins(player1: string[], player2: string[]): string {
    let result = 'Draw 0 to 0!';
    if (this.cards.indexOf(player1[0]) > this.cards.indexOf(player2[0])) {
      result = 'Player 1 wins 1 to 0!';
    }

    if (this.cards.indexOf(player2[0]) > this.cards.indexOf(player1[0])) {
      result = 'Player 2 wins 1 to 0!';
    }

    return result;
  }
}
