# Conditionals and boolean

Conditionals is a way for a computer to handle decisions. Given some condition the program should be able to account for that. This is done using something called a conditions conditional statement. 



Watch these videos as support 👇

https://youtu.be/FeRTS6A6KvA

https://youtu.be/YT2vWyJw2AM



## Boolean

A boolean is a Java type that stores either `true` or `false`. 

An real world example of a boolean element is a checkbox like in the image below

![Checkbox](../../assets/checkbox.png)

The `Husk mig?` checkbox can either be checked (`true`) or unchecked (`false`)



Let's move into Java 👇

Lets say we want to create a `boolean` variable that stores the value of the checkbox above. We would do that like this:

````java
// here we declare the variable rememberMe as a boolean 
//and assign the value of false (because the checkbox is unchecked)
boolean rememberMe = false;
````



We could also store a boolean indicating if the sun is shining today:

```java
// here we declare the variable isSunShining as a boolean
// depending on the weather we either set it to true or false
// lets say the sun is shining
boolean isSunShining = true;
```



## Relational operator

What if we had a variable called `televisionPrice` that we wanted to check was expensive. We could fx say that prices larger than 10.000 is an expensive price. In Java we would do that like this:

```java
int televisionPrice = 12000;
boolean isTelevisionExpensive = televisionPrice > 10000;
// > reads as "is larger than"
System.out.println(isTelevisionExpensive); // true
```



There are 6 different relational operators

- `x == y` - `x` is equal to `y`
- `x != y`  - `x` is not equal to `y`
- `x > y` - `x` is greater than `y`
- `x < y` - `x` is less than `y`
- `x >= y ` - `x` is greater than or equal to `y`
- `x <= y` - `x` is less than or equal to `y`



**This is perfect for something like peer instruction!!!**

Exercise possibility

a person is higher than 2 meters. So this means 



## Logical operator

There are different logical operators we can use

- `&&` - And operator
- `||` - Or operator



### And operator

And operator evaluates to `true` if both the expression to the right 👉 **and** 👈 the left of the `&&` is `true`. If **one of them** is `false` the expression will be `false`

Here is a table showing and values

![And truth table](../../assets/and-truth-table.png)



```java
boolean a = true && true;
System.out.println(a); // true
boolean b = false && true;
System.out.println(b); // false
boolean c = false && false;
System.out.println(b); // false

// more real world example
boolean isOwner = true;
boolean isLoggedIn = true;
boolean canEdit = isOwner && isLoggedIn;
System.out.println(canEdit); // true
```

For the real world example. Imagine we as developers need to check if a developer can edit some document. We might make a check as the one shown above



### Or operator

Or operator evaluates to `true` if the expression to the right 👉 **or** 👈 the expression to the left of the `||` is `true`. If **both** of them are `false` the expression will be `false`

Here is a table showing or values

![Or](../../assets/or-truth-table.png)



```java
boolean a = true || true;
System.out.println(a); // true
boolean b = false || true;
System.out.println(b); // true
boolean c = false || false;
System.out.println(c); // false

// more real world example
boolean isOwner = false;
boolean hasAccess = true;
boolean canEdit = isOwner || hasAccess;
System.out.println(canEdit); // true
```



## Exercises

Create a user:  https://codingbat.com/java1

Solve the first 3 exercises in the module ”Logic 1” 

- cigarParty
- dateFashion
- squirrelPlay



## Conditional statements

Conditional statments is the mechanism for which a computer takes decisions. The most typical conditional statement is a **if sentence**. Lets look at an example



### If sentence

```java
boolean isSunShining = true;
if (isSunShining) {
  System.out.println("The sun is shining ☀️");
}
```

Here we first define the `boolean` variable `isSunShining` to be `true`. Then we comes the if sentence. Only if `isSunShining` is `true` the code within the brackets (`{}`) will be executed. 



![If sentence](../../assets/if-sentence.png)



### If else sentence

But what if we wanted to print something else if the sun it **not** shining? For that we add an `else`:

```java
boolean isSunShining = false;
if (isSunShining) {
	System.out.println("The sun is shining ☀️");
} else {
	System.out.println("The sun is not shining 🌧️");
	System.out.println("Oh no ☹️");
}
```

*Try on [Pythontutor](http://www.pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20boolean%20isSunShining%20%3D%20false%3B%0A%20%20%20%20%20%20if%20%28isSunShining%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20sun%20is%20shining%20%E2%98%80%EF%B8%8F%22%29%3B%0A%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20sun%20is%20not%20shining%20%F0%9F%8C%A7%EF%B8%8F%22%29%3B%0A%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)*

Now when `isSunShining` is `false` the code within the brackets after the `else` will be executed. 



Here is a flow diagram showing how if-else sentence works:

![If else flow diagram](../../assets/if-else-flow-diagram.png)



### Else if

What if we wanted to take decisions based on more that just `if` or `else`? For that we need and `else if` sentence. Here is an example

```java
int age = 23;
if (age < 16) {
	System.out.println("You cannot buy any alcohol ✋");
} else if(age > 16 && age < 18) {
	System.out.println("You can now buy beer 🍺");
} else {
	System.out.println("You can now buy all alcohol 🍹");
}
```



## Real world example

Lets create a more real world example before moving on to exercises

```java
int userAge = 13;
int accountAmount = 100;
// Lets say this comes from the user
int accountToWithdraw = 50;
boolean canUserWithdraw = accountAmount - accountToWithdraw > 0;

if (userAge >= 13 && canUserWithdraw) {
    System.out.println("Withdrawing " + accountToWithdraw + " dollars 💵");
} else {
    System.out.println("Sorry you cannot withdraw any money");
}
```

*Try on [Pythontutor](http://www.pythontutor.com/java.html#code=int%20userAge%20%3D%2013%3B%0Aint%20accountAmount%20%3D%20100%3B%0A//%20Lets%20say%20this%20comes%20from%20the%20user%0Aint%20accountToWithdraw%20%3D%2050%3B%0Aboolean%20canUserWithdraw%20%3D%20accountAmount%20-%20accountToWithdraw%20%3E%200%3B%0A%0Aif%20%28userAge%20%3E%3D%2013%20%26%26%20canUserWithdraw%29%20%7B%0A%20%20%20%20System.out.println%28%22Withdrawing%20%22%20%2B%20accountToWithdraw%20%2B%20%22%20dollars%20%F0%9F%92%B5%22%29%3B%0A%7D%20else%20%7B%0A%20%20%20%20System.out.println%28%22Sorry%20you%20cannot%20withdraw%20any%20money%22%29%3B%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)*

Can you think of an example using if, else if, else?



## Exercises

Peer instruction after one hour



## Exercise 1 - switch and ternary

Find a partner group. One groups investigates switch while the other investigates ternary expression. 

You have 30 minutes to prepare a presentation for the other group explaining either switch or ternary When preparing focus on these things

- How does the conditional work that you picked?
- Write a practical code example of how to use what your group picked
- In what situations should someone use what you picked?

The presentation should be around 5-10 minutes. Have the presentation as you like. If slides works for you then use that, if just code works for you the use that, if a document is better then use that. 



## Exercise 1.1 

Read this method and figure out what it does (without a computer). 

Try and 

- Rename some of the variables
- Figure out how to call it
- Figure out how to assign the return value to a new variable. Then print that variable

```java
public static boolean abc(String word) {
    boolean a = false;
    int b = word.length() - 1;
    if (word.charAt(b) == 'n' && word.charAt(b-1) == 'a') {
        a = true;
    }

    return a;
}
```



### Exercise 2 - Level 1

Write a method that accepts an array. If the array has more than 4 items the method should return `true` otherwise `false`. Fx

```java
String[] names = {"benjamin", "ahmad"};
boolean arrayLargerThanFour = exercise2(names); // false
```



### Exercise 2.2 - Level 1

Write a method that accepts a number. It should return  `true` if the number is positive but `false` if it is negative. 

Now use the method you created.  

- Get a number from a user (in the main method)
- Use the method created above to pass in the number as an argument. 
- Capture the return value into a variable and print that variable out!



### Exercise 3 - Level 2

Write a Java program that takes the user to provide a single  character from the alphabet. Print Vowel or Consonant, depending on the  user input. If the user input is not a letter (between a and z or A and  Z), or is a string of length > 1, print an error message. Fx: 

```
Input an alphabet: 
p
Input letter p is a consonant
```



### Exercise 6 - Level 2

Write a program that accepts three numbers from the user and prints  "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing  order" otherwise.

```
Input first number: 
1524 
Input second number: 
2345
Input third number: 
3321
Increasing order
```



### Exercise 4 - Level 2

A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.



### Exercise 3.1 - Level 3

Create a game where two players play against each other. 

Each player has to guess what number (between 1 and 100) the other person guessed. The person that guesses closest to the other persons guess wins. 

When both players have put in the expected number of the other and his number, write who won. 

```
Player 1 what number do you think player 2 will guess?
34
Player 2 what number do you think player 1 will guess?
56
Player 1 what number will you guess?
76
Player 2 what number will you guess?
95
Player 1 was 61 off, player 2 was 20 off. 
Player 2 wins 🏆
```

The players off course can not see each other guesses (maybe you can print a lot of new lines after each guess)



### Exercise 3.1 - Kings Island - Level 3

**Part one**

King’s Island needs a program for its admission booths.  When visitors to the park come up to the booth to 
purchase their tickets, the worker uses this program to figure out how much to charge them. You will write 
this program.  In the first version of the program, there is one ticket price of $30.00.  Senior citizens (age ≥ 65) are given a 
50% discount.  Write this program as follows.  Import your Scanner.  Declare the needed variables (the person’s 
age, the base price of a ticket ($30) and the price you will charge).  Input the user’s age, compute the price of 
the ticket and output the result in a formatted way (that is, using a $).  You do not need to use DecimalFormat 
for this part of the program but you will as you enhance it so you might want to set this up now.  Save, compile 
and run your program a few times, asking the user for different ages such as 10, 50, 65, 80 and 0. 



**Part two**

The park wants to add further alterations to ticket costs.  Children under 5 (less than 5, not less than or equal 
to) are free.  Ticket prices are now $40 unless the person is from Warren County in which case the tickets are 
$30.  Senior citizens still receive a 50% discount regardless of their county of residence.  There are two input 
parameters now, one for age and one for county.  For the county, input this as a String.  See below about how 
to compare Strings.  Calculate and output the ticket price.  Ticket prices should be either 0, $15, $20, $30 or 
$40 depending on the person’s age and location. 



**Part three**

Second, we want to give discounts to people from other counties as follows.  Children under 14 from Clermont 
County get an 18% discount (over the base price of $40) and senior citizens (>= 65) from Campbell County 
get an additional 7.5% discount over their senior citizen discount.



### Exercise 4 - Level 2

Write a program in Java to make such a pattern like below with a number which will repeat a number in a row.The pattern is as follows: 

```
1
22
333
4444
```



### Exercise 5

Write a program in Java to display the pattern like a diamond. Fx

*Expected Output* :

```
Input number of rows (half of the diamond):
7
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      *                     
 
```



### More exercises here

https://www.codesdope.com/practice/java-decide-if-or-else/
