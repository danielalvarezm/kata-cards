/* eslint-disable prettier/prettier */
import { Main } from '../src/main';

describe('Cards kata', () => {
  const main = new Main();
  
  it('The person with the highest card wins', () => {
    
    expect(main.playerWins(['3'], ['1'])).toBe('Player 1 wins 1 to 0!');
    expect(main.playerWins(['1'], ['5'])).toBe('Player 2 wins 0 to 1!');
    expect(main.playerWins(['K'], ['J'])).toBe('Player 1 wins 1 to 0!');
    expect(main.playerWins(['4'], ['Q'])).toBe('Player 2 wins 0 to 1!');
  });

  it('Draw between the two players', () => {
    
    expect(main.playerWins(['4'], ['4'])).toBe('Draw 0 to 0!');
    expect(main.playerWins(['K'], ['K'])).toBe('Draw 0 to 0!');
  });

  it('Wins the player with the highest score', () => {
    
    expect(main.playerWins(['4', '6'], ['1', '2'])).toBe('Player 1 wins 2 to 0!');
    expect(main.playerWins(['1', '3'], ['4', '5'])).toBe('Player 2 wins 0 to 2!');
  });

  it('One of the players has less cards', () => {
    
    expect(main.playerWins(['4', '6'], ['1'])).toBe('Error: One player has less cards');
    expect(main.playerWins(['1'], ['4', '5', 'K'])).toBe('Error: One player has less cards');
  });

});
