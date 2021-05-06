# Conditionals

Conditionals is a way for a computer to handle decisions. Given some condition the program should be able to account for that. This is done using something called a conditions conditional statement. 

Before we talk about conditional statments lets talk about the type `boolean`



## Boolean

A boolean is a Java type that stores either `true` or `false`. Lets say we want to create a `boolean` variable that stores if the weather is shining today. We would do that like this:

````java
// here we declare the variable isSunShining as a boolean
boolean isSunShining;
// depending on the weather we either set it to true or false
// lets say the sun is shining
isSunShining = true;
````



### Boolean expressions

What if we had a variable called `televisionPrice` that we wanted to check was expensive. We could fx say that prices larger than 10000 is an expensive price. In Java we would do that like this:

```java
int televisionPrice = 12000;
// > reads as "is larger than"
boolean isTelevisionExpensive = televisionPrice > 10000;
System.out.println(isTelevisionExpensive); // true
```



There are 6 different boolean expressions:

- `x == y` - `x` is equal to `y`
- `x != y`  - `x` is not equal to `y`
- `x > y` - `x` is greater than `y`
- `x < y` - `x` is less than `y`
- `x >= y ` - `x` is greater than or equal to `y`
- `x <= y` - `x` is less than or equal to `y`







**This is perfect for something like peer instruction!!!**



Exercise possibility

a person is higher than 2 meters. So this means 



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



![If sentence](assets/if-sentence.png)





### If else sentence









