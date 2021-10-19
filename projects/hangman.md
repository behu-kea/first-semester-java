# Hangman 

The rules of hangman: https://www.youtube.com/watch?v=cGOeiQfjYPk

### First iteration (Mandatory elements)

###### UML

Draw a sequence diagram of the Hangman. 

###### Source code

Implement the hangman game. 

The requirements are:

- Read words from a list of words.

  - The game has 2 settings "Easy" or "Hard"
  - Easy only has words that are equal to or less than 5 characters
  - Hard has letters with more than 10 characters

- Every turn, the current guessed letters are displayed on screen while also showing what is not yet guessed.

  - E.g:

  User guesses D

  - D _ _ d _ 
  - is displayed

  User guesses A

  - D _ _ d a 
  - is displayed

### Second iteration (Advanced - not mandatory)

Traditionally hangman is played as a multiplayer game.

You will be implementing the single player part for hangman.

If the player picked "Easy" at the start, they should lose if they haven't guessed the words within 6 guesses.

If the player picked "Hard" at the start, they should lose if they haven't guessed the words within 10 guesses.

- Update the System Sequence Diagram
- Consider efforts that can be modular & reused between Singleplayer & multiplayer to not duplicate code

### Third iteration (Advanced - not mandatory)

At any point in the game, the player can choose to save the game.

The "Save" function will persist a file on disk, that represents the game state.

At the start of the program, the user is asked whether he/they will want to continue in a saved game