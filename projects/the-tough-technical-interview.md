# The tough technical interview



We have been selected among the best of the best for a company. 

As part of their hiring process they have sent us some tasks to perform. This is in order for them to test our 



## Tasks



### Task 1

Create a method that prints the following text:

`Use "\\" to obtain a ’backslash’ character.`



### Task 2 - Hmm er den for svær?

Skriv et program `RomanNumerals` som konverterer et positivt heltal på decimalform til romer- tal. Det vil sige hvis f.eks. inputtet er 6 skal outputtet være `VI` og hvis inputtet er 29 skal outputtet være `XXIX`. Du kan læse om reglerne for dannelse af romertal på nettet (søg på “roman numerals”).

Eksempel:

```
Enter positive integer to convert: 1999
1999 = MCMXCIX
```



### Task 3

Skriv et program Palindrome som checker om en tekst er et palindrom. Det vil sige om det læses ens forfra og bagfra som f.eks. "Ryd vores dug. Ret dog netgardinet. Tak, Egil. Viggo, gid da denne dame så de samer af dem, der red med fare, mase dåsemaden ned ad dig. Og giv lige katten i dragten godter. Gud se, rovdyr!" (i Guinness’ Rekordbog 1985 ifølge http://www.palindromer.dk). Du kan læse om reglerne for palindromer på nettet (søg på “palin- drome”). Bemærk at der ikke tages hensyn til forskellen mellem store og små bogstaver, og at der ses bort fra alle tegn som ikke er bogstaver.

Eksempel:

```
Enter line to check: En af dem, der tit red med fane.
"En af dem, der tit red med fane." is a palindrome!
```



### Task 4 - Er det her for svært?

En 2-dimensionel *random walk* simulerer den tilfældige opførsel af en partikel, som bevæger sig i en plan — eller bevægelsen af en turist i Manhattan, som ved hvert vejkryds vælger en tilfældig vej at gå. I hvert skridt i en random walk vælger man at gå enten mod nord, syd, øst eller vest, alle med lige stor sandsynlighed.

Normalt foregår en random walk i et *grid*, dvs. et udsnit at planen delt op i felter som på et skakbrædt. Dette er illustreret på figur 1.

Felterne i griddet angives ved deres heltalskoordinater som på figuren.

Skriv et program RandomWalk som tager et heltal *n* som input fra brugeren og udfører en random walk på et grid med koordinaterne (−*n*, −*n*) i nederste venstre hjørne og koordinaterne (*n*, *n*) i øverste højre hjørne. Figuren ovenfor svarer til et grid med *n* = 2.

Random walken skal starte i koordinatsættet (0, 0). I hvert skridt skal man enten bevæge sig ét felt op (mod nord), ét felt ned (mod syd), ét felt til højre (mod øst) eller ét felt til venstre (mod vest). Random walken skal fortsætte, indtil den første gang bevæger sig uden for det angivne grid.

Program skal som output give de enkelte koordinater som random walken passerer, samt til slut hvor mange skridt random walken har foretaget i alt.



Eksempel:

```
Enter size of grid: 4
Position = (0,0)
Position = (0,1)
Position = (1,1)
Position = (1,2)
Position = (2,2)
Position = (1,2)
Position = (1,3)
Position = (2,3)
Position = (2,2)
Position = (3,2)
Position = (4,2)
Position = (4,1)
Position = (4,2)
Position = (4,3)
Position = (5,3)
Total number of steps = 14
```



### Task 5

Exercise 12: Write a class `DiagonalMatrix` which produces the following 6 ×6 output

```
0 1 2 3 4 5
1 0 1 2 3 4
2 1 0 1 2 3
3 2 1 0 1 2
4 3 2 1 0 1
5 4 3 2 1 0
```


Hint: Use a class constant, so that you can print the same scheme with a n rows and
columns, where n is between 1 and 10,



### Task 6

A certain bank offers 6.5% interest on savings accounts, compounded annually. Create a table that shows how much money a person will accumulate over a period of 25 years, assuming an initial investment of $1000 and assuming that $100 is deposited each year after the first. Your table should indicate for each year the current balance, the interest, the new deposit, and the new balance.

> Use tabulators (`\t`) to structure the table



### Task 7

Write a method which transforms a mark on the old 13-scale to one on the 7-step scale.

```
public static int convert13to7(int grade)
```



Make your program throw an `IllegalArgumentException` if the input is not a mark on the 13-scale.



### Conways game of life???



### Maze

Two dimensional array

1 is wall 0 is path. find 

- Is the maze solvable
- find a way through the maze
- Find the shortest way through the maze

Print the path you took





*Opgaver taget fra DTU afleveringer i Indledende programmering*