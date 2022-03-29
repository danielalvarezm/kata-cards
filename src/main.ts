/* eslint-disable @typescript-eslint/no-empty-function */
export class Main {
  private cards = '123456789TJQK';
  constructor() {}

  public playerWins(player1: string[], player2: string[]): string {
    if (this.cards.indexOf(player1[0]) > this.cards.indexOf(player2[0])) {
      return 'Player 1 wins!';
    }
    return 'Player 2 wins!';
  }
}
