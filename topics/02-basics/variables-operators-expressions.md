# Variables, operators and expressions



Today we will be working with operators and variables. 



Watch this video as support 👇

https://youtu.be/JlXJ0eCPteo



## Variables

A variable is a container for some value (data). As the image shows below we can save the number 22 (value) in a variable we call `x`. In Java that would look like this:

```java
int x = 22;
```



![Variables are like boxes (from Khan Academy)](https://github.com/HackYourFuture-CPH/JavaScript/raw/master/javascript1/week1/assets/box.png)



Lets disect the above code example:

- `int` is the **type** of the variable
- `x` is the **name** of the variable
- `22` is the value we **assign** to the variable called `x`



Let's make a more real world scenario:

```java
int salary = 400000;
```

In this example we assign the value of `400000` to a variable called `salary`. The type of `salary` is `int`

![Variable explanation](../../assets/variable-type-name-value.png)



### Naming

When giving Java variables names, use lowerCamelCase. Here new words start with capital letter, but the first letter is lowercase. 

Also write all variables in English! 

When coming up with a name, try and describe what the variable contains/represents **not** what it is!

```java
// Stores budget for house renovation
int Myintegervalue = 60000;
```

`Myintegervalue` is not good! Wrong way of writing the name. Should have been `myIntegerValue`. Also the naming is not great, since the variable represent a budget, maybe a name like `budget` or more precisely `houseRenovationBudget` would be better. 



### Types

In Java it's very important that the type of the variable is specified. Not all programming languages are like that but Java is **very** strict with this!

There are lots of different types in Java. Let's have a look at some of them:

- `int` - Stores integers. Integers are whole numbers. That means `2`, `-344` or `6000` but not `2.2` or `3.1415`
- `double` - Stores numbers with decimal. Fx `2.2` or `3.1415`
- `char` - Stores a single character. Fx the character `a` or the character `y`. `char` have single quotation around them `'a'` or `'y'`
- `String` - Stores text. So if i wanted to store my name or the the city Copenhagen. String are stored with double quotation around them `"Benjamin"`, `"Copenhagen"`

You can read up on more more Java types here: https://www.w3schools.com/java/java_data_types.asp dont get too frightened we will learn the types as we progress with the language. One thing at a time 😄

![Variable types](../../assets/variable-types.png)





### Print out your variables

To see the value of your variables we print the value to the console. Now what does that mean? 

The console you can see as way for us developers to know how our program is doing. A console can help us write correct code. In the console fx we can see errors  that were thrown or warnings. 

To print something to the variable write the following:

```java
System.out.println(23);
```

This will print `23` to the console. We can print whatever we want to fx

```java
int salary = 400000;
System.out.println(salary);
```

Now `400000` will be printed to the console!



#### Where to find the console

When you run your Java application the console should appear in the bottom of the IDE!



![Console](../../assets/console.png)



### Some more code examples

When i write `//` in Java that means a comment. A comment is invicible to Java and will not be seen

```java
// variable declaration but no assignment
int pages;
// assignment happens later!
pages = 456;
// the variable called pages can be reassigned (changed)
pages = 455;

// lets try and declare and assign a string
String bookTitle = "To the sea";
// lets try and change that!
bookTitle = "From the sea";
```



### `final`

The `final` keyword means that a variable cannot be changed! 

```java
final String name = "benjamin";
name = "peter"; // Java throws an error!!
```

It is typically used for constants or things that cannot change lke a cpr-number fx or social security number



### Exercise 1

With the person sitting next to you. Create a new Java class called `Person.java`. Use the code below as a start

```java
public class Person {
    public static void main(String[] args) {
				// Write your code here
    }
}
```

Do these steps one step at a time! Think about what type of data should be stored in the different variables

1. Create a variable called `age` (no assignment!)
2. Create another variable called `height`
3. Assign `age` to be your age
4. assign `height` to be your height in meter
5. Create the variable `shoeSize` and assign it to be your shoesize
6. Create a variable called `name` and assign this to your name

*Remember to compile at each step!*



## Operators and expressions

> An expression is a simple value or a set of operations that produce a value



The simplest expression is just a value fx `55.9` but if we go a bit more advanced we can do things like addition:

```java
3 + 5
```

Here `+` is called the operator. Lets take a look at some more operators



### Arithmetic Operators

- `+` - Addition
- `-` - Subtraction
- `*` - Multiplication
- `/` - Division
- `%` - Modulus



## More complex expressions

It is possible to create more complex expressions:

````java
result = 3 * 5 / 5 + 1 // will this java code run??
````



![Expression](../../assets/expression.png)



### Order op operations

![Order of operations](../../assets/order-of-operations.png)



## Exercises

With the same person from the previous task go through these exercises



### Exercise 1.1

It is important to know in what orede Java executes operations. So some of the next exercises will focus on learning exactly that. 

In what order will Java calculate these different expressions?

```java
int radius = 100 * 100 / 5 + 200 * 3 / 2;
double result = radius * 3.14 * 0.1;
double profit = salesPrice - purchasePrice * 0.8;
int result = 2 + 3 * 4 + 10 / 5 * 2 – 1 + 3;
int modulus = 10 % 3;
```



### Exercise 1.2

Write a Java program to print the sum of two numbers.



### Exercise 1.3

Write a Java program to print the result of the following operations.

1. `-5 + 8 * 6`
2. `(55 + 9) % 9 `
3. `20 + -3 * 5 / 8`
4.  `5 + 15 / 3 * 2 - 8 % 3`



### Exercise 2

Convert 100 Fahrenehit to Celcius



### Exercise 3

Print the following message, with the same format as below in **one** `System.out.println`!:

````
Software development
The best subject ev-er
Learning "Java" is the most fun you can have
2 + 2 = 5;
````

You have to Google to figure this question out!



### Exercise 4

Compute first in hand the result of `(9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)`

Now compute and print the result in Java



### Exercise 5

Compute how many miles 19 kilometers are



### Exercise 6

Write variables to represent a rectangle:

- Width of 5.5

- Height of 8.5

Compute the area and the perimeter of the rectangle and print the results



### Exercise 7

Write a Java program to print the area and perimeter of a circle. 



```Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
```



### Exercise 8

Take a look at this pizzamenu

http://pizzaderoma.dk/index.php/menukort

First figure out all the different kinds of data that is stored here. Fx

- Pizza numbers
- Pizza prices
- Etc

How would you represent all the different data that is stored here? 



### Exercise 9

If you come to here, see if there are any of your classmates that needs help! 

If not continue with the exercise: https://behu.gitbook.io/java-first-semester/topics/basics/strings#execise-4



*For next time 1. semester class: More focus on modulus! More focus on casting (auomatic and up and down casting)*
