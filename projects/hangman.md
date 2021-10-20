# Hangman 

The rules of hangman: https://www.youtube.com/watch?v=cGOeiQfjYPk

### First iteration (Mandatory elements)

###### UML

Draw a sequence diagram of the Hangman. 

###### Source code

Implement the hangman game. 

**The requirements are:**

- Read a word from a file.

- Every turn, the current guessed letters are displayed on screen while also showing what is not yet guessed.

  - E.g:

  User guesses D

  - D _ _ d _ 
  - is displayed

  User guesses A

  - D _ _ d a 
  - is displayed
  
- If the user guesses wrong more than 6 times - they lose the game

### Second iteration (Advanced - not mandatory)

- The game has 2 settings "Easy" or "Hard"

- Easy only has words that are equal to or less than 5 characters

- Hard has words with character amount higher than 10 characters

  

### Third iteration (Advanced - not mandatory)

At any point in the game, the player can choose to save the game.

The "Save" function will persist a file on disk, that represents the game state.

At the start of the program, the user is asked whether he/they will want to continue in a saved game