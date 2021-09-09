# Methods project

This is an alternative to the face creator assignment



## Task 1

Write a Java method to find the smallest number among three numbers. The number should come from a user inputting 3 numbers

Test Data:
 Input the first number: 25
 Input the Second number: 37
 Input the third number: 29 

 Expected Output:

```
The smallest value is 25.0
```



## Task 2

Write a method that as a parameter gets a number. It should then print to the console of the number is negative, positive or zero



## Task 3

Write a method to find the middle character of a string. The method should take a String as parameter

*Think about if the word is odd, even, empty character*

Fx

```java
char middleCharacter = getMiddleCharacter("benjamin"); 
System.out.println(middleCharacter); // j
```



## Task 4

Write a java method to calculate the area of a triangle. It should take 3 sides as parameter

Expected Output:

```
Input Side-1: 10                                                                               
Input Side-2: 15                                                                               
Input Side-3: 20                                                                              
The area of the triangle is 72.6184377413890
```



## Task 5

Write a Java method to check whether an entered string is a valid password. Here are the requirements:

1. A password must have at least eight characters
2. A password must consists of only letters and digits
3. It cannot contain the string `"secret"`
4. The first character must not be a dash (`-`)

The method should return `true` is the password is valid otherwise `false`



## Task 6

Lav en metode ved navn printNumbers som tager et naturligt tal, maximum, som argument og skriver tallene fra 1 til og med maximum i firkantede paranteser.
For eksempel skal metoden håndtere disse kald:

```
printNumbers(15);
printNumbers(5);
```

og producere følgende output:

```
[1][2][3][4][5][6][7][8][9][10][11][12][13][14][15]
[1][2][3][4][5]
```

Du må gerne antage, at input er større end 1