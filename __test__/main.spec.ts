/* eslint-disable prettier/prettier */
import { Main } from '../src/main';

describe('Cards kata', () => {
  const main = new Main();
  
  it('The person with the highest card wins', () => {
    
    expect(main.playerWins(['3'], ['1'])).toBe('Player 1 wins!');
    expect(main.playerWins(['1'], ['5'])).toBe('Player 2 wins!');
    expect(main.playerWins(['K'], ['J'])).toBe('Player 1 wins!');
    expect(main.playerWins(['4'], ['Q'])).toBe('Player 2 wins!');
  });

  it('Draw between the two players', () => {
    
    expect(main.playerWins(['4'], ['4'])).toBe('Draw!');
    expect(main.playerWins(['K'], ['K'])).toBe('Draw!');
  });
});
