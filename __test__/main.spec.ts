import { Main } from '../src/main';

describe('Cards kata', () => {
  it('The person with the highest card wins', () => {
    //const main = new Main('Hello world');
    expect(playerWins(['1'], ['5'])).toBe('Player 2 wins!');
  });
});
