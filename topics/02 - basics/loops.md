# Loops

 A Loop is a programming construct that can help with repetitive tasks. 



There are different ways of creating loops in programming languages. We will look at the most important one



## For loop

The for loop is the most used loop and one you see quite often. The syntax is a bit weird, but let's run through an example:

```java
for (int i = 0; i < 3; i++) {
    System.out.println("This is iteration " + i);
}
```

The first part is the `for`. This just tells Java that we will be creating a `for` loop. Now comes three parts of the for loop:

1. `int i = 0;` This is the starting condition. This means that Java will create a for loop where the variable `i` is `0`
2. `i < 3;` This part tells Java for how many times the for loop should run. In this example the for loop should run while `i` is smaller than `3`
3. `i++` This part tells Java what to do after each iteration. In this example the for loop tells Java to increment `i` by `1` for eacher iteration

Inside the brackets we write the code to run for each iteration. This code will print the following to the console

```
This is iteration 0
This is iteration 1
This is iteration 2
```



![Screenshot 2021-05-10 at 12.21.04](../../assets/for-loop.png)



> There are other kind of loops like a while or do-while loop. We might get into that later. 



## Scope

Scope is a concept about where variables will be exist and where they no longer will exist. 

Let's say i wanted to do something like this 👇 

```java
for (int i = 0; i < 7; i++) {
    System.out.println("Hello");
  	System.out.println(i);
  	// Above this line number does not exist!
    int number = i;
  	// below this line number exists but only until the closing bracket!
}

System.out.println("The last number is: " + number); // Cannot resolve number
```

I make a for loop that runs from 0 - 6. Then I assign the current iteration number (`i`) to `number`

When the loop is done I print out `number`. But there is a problem! Java tells me that `Cannot resolve number`. This means cannot find `number`. The reason is that `number` only exists after it has been defined and within the curly brackets of the for loop! This is called **block scope**

To fix this problem we can define `number` before the for loop. Now `number` will be available to the for loop

```java
int number = 0;
for (int i = 0; i < 7; i++) {
    number = i;
}

System.out.println("The last number is: " + number); // prints 6
```





## Exercises



### Exercise 1

1. Write a method that prints out ”Hello World” 3 times

2. Use a for loop to print the numbers from 1 to 10

3. Use a for loop to print a `*` 10 times

4. Use a for loop to print the numbers starting from 5 to -5 



### Exercise 2

Write a method that prints out the statement

 `I am now printing for the [Num-ber of iteration]th time`

Run 10 iterations.



### Exercise 3

Write a method that prints a random number of hashtags # (Maximum 10)

*Hint - try google `java random number between`* 



### Exercise 3 - Nested for loops

You can have a for loop in a for loop. See if you can print the following patterns to the console



![Screenshot 2021-05-10 at 12.25.46](../../assets/loop-exercise.png)





![Screenshot 2021-05-10 at 12.26.22](../../assets/loop-exercises-2.png)


