/* eslint-disable @typescript-eslint/no-empty-function */
export class Main {
  constructor() {}

  public playerWins(player1: string[], player2: string[]): string {
    if (parseInt(player1[0]) > parseInt(player2[0])) {
      return 'Player 1 wins!';
    }
    return 'Player 2 wins!';
  }
}
