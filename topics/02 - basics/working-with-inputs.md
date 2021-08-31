# Workin with inputs



Most software programs need to take some kind of input from the user. Maybe its the users name, age og the number of search results the user want to see. In Java we can also get input from the user. So lets learn how that works:



## `Scanner` class

The `Scanner` class is used to get inputs from a user. 

Here is a program that asks for a users name and then outputs that to the console

```java
import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter name");

    String name = scanner.nextLine();  // Read user input
    System.out.println("Name is: " + name);  // Output user input
  }
}
```

So `import java.util.Scanner;` this line will import the package so that we can work with the `Scanner` class

`Scanner scanner = new Scanner(System.in); ` will create a scanner that we can work with. Don's worry about the `new` keyword you will learn that later. 

`String name = scanner.nextLine();` This line will ask the user to input some text in the console. That means that the program actually stops executing before the user has written some text and pressed enter. Now what the user has written will be assigned to the variable `name` that then will be logged out. 





## Scanner types

There are different methods for getting data from the user. In the example above we user `scanner.nextLine()`. But we can specify which type we expect. Here are some examples:

- `scanner.nextInt()`
- `scanner.nextDouble()`
- `scanner.nextInt()`



Now what do you think happens when a user writes some text but the input that was expected was an `integer`? Then Java will throw an error: 

![Screenshot 2021-06-04 at 14.41.01](../../assets/scanner-type-mismatch.png)

Here Java is throwing the `InputMismatchException` error. So Java is telling us that there is a mismatch between the expected type of the input (an `int`) and the actual type of the input (a `String`)



## Exercises



#### Question 1

How can this code be fixed?

```java
Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
String name = scanner.nextLine();

System.out.println("Your name is " + name + "and your age is + age);
```



### Exercise 1.1

Write a program that prompts the user to provide a String and prints the string provided to the console.  The code should be commented such that every line is explained.



### Exercise 2

Write a program that prompts the user to provide a number, computes the half of the number and prints the result with a friendly message



## Peer instruction

1. Question
2. Think
3. Response 1
4. Discuss
5. Response 2
6. Let groups explain/teacher explain



## Peer instruction questions after the first break!



### Question 1

What will this code output if i input `34`?

```java
Scanner scanner = new Scanner(System.in);
int age = scanner.nextInt();
double doubleAge = age * 2;
System.out.println("Your double age is: " + doubleAge);
```

1. `Your double age is: 68 `
2. `Your double age is: 68.0`
3. `Your double age is: "68"`
4. Incompatible types



### Question 2

What will this code output if i input `34`?

```java
Scanner scanner = new Scanner(System.in);
String age = scanner.nextLine();
String agePlusTwo = age + 2;
System.out.println("Your age plus two is: " + agePlusTwo);
```

1. `36`
2. `'36'`
3. `342`
4. Incompatible types



### Exercise 3

Write a program that prompts the user to provide an integer `n` and prints the multiplication of `n` and 1000. You can assume the `n` is between 0 and 100



### Exercise 4

Write a program that prompts the user to input 5 numbers from keyboard. Find & print their sum and average.



### Exercise 5

Write a program that prompts the user to input their name, height & weight. Calculate & print their BMI number and provide the  answer with a friendly message



### Question 6

Improve the variable names in this code

```java
Scanner myObjectMapperDataCloud = new Scanner(System.in);
System.out.println("Please write your name here:");
String myString = scanner.nextLine();
String abd = myString + " - Thank you for logging in 🎉";
System.out.println(abd);
```



### Question 6.1

Write a Java program to convert minutes into a number of years and days. 

The user should be able to put in how many minutes he wants to convert. 

Here is an example: `3456789 minutes is approximately 6 years and 210 days`



### Question 6.2

Write a Java program that reads a number (from the user) and display the square, cube, and fourth power.

Here is an example: 

Input: 4

Square: 16

Cube: 64

Fourth: 256



### Question 6.3

Write a Java program that accepts two integers from the user and then  prints the sum, the difference, the product, the average, the distance  (the difference between integer), the maximum (the larger of the two  integers), the minimum (smaller of the two integers)

Here is an example:

```
Input 1st integer: 25
Input 2nd integer: 5
Expected Output:
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
```



### Question 6.4

Write a Java program to compute the area of a hexagon. The user should put in the length of one of the sides. 

Here is an example:

Input the length of a side of the hexagon: `6`

```
The area of the hexagon is: 93.53074360871938
```



### Question 6.5

Write a Java program to compute the area of a polygon.

The user should put in 

- `n` is n-sided polygon
- `s` is the length of a side

Here is an example:

Input the number of sides on the polygon: 7
Input the length of one of the sides: 6

```
The area is: 130.82084798405722
```



### Question 7

Create a money conversion java program. 

It should give the user a welcoming message. After the welcome message the user should write an amount in kr. This amount should be converted to at least 4 different currencies and printed to the user in a easy to understand way. 

https://www.xe.com/currencyconverter/
