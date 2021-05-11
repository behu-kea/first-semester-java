# Methods

When writing Java we often times have to do repetitive tasks. 

- Check that this user is logged in
- Get all the comments for a specific Post
- Create a new user

 Methods help us manage these repetitive tasks



## Lets begin with a good old metaphor

Imagine you have a huge machine. The machine has lots of things you can control. Like a lever, 3 buttons, a pulley and wheel and much more. All of this affects what happens inside the machine. It works by giving the machine some input. Now the input is transformed through the machine and in the end you get an output. 





![Screenshot 2021-05-11 at 15.30.15](assets/machine.png)



Imagine now that the machine is actually a **method**, the inputs in Java is called **arguments**, the things that control the method are called **parameters**, the output of the machine is called a **return value**. That might not make a lot of sense for now, but keep the metaphor of the machine, it will get handy later on!



## Working with methods

Let's create a method that will double any number we give it!

```java
public int doubleNumber(int number) {
		return number * 2;
}
```

Let's disect the code

- `public` - Means that the method can be seen by other developers. **HVORDAN FORKLARER JEG DET HER????** 
- `int` - Tells Java that the method will return an integer
- `doubleNumber` - This is the name of the method. It could be called anything
- `(int number)` - Inside the paranthesis we put the parameters of the method
- `return number * 2;` - Inside the brackets is the code the method will run. `return` tells Java to return a value when the method runs. In this example number times two











