# Interfaces

An interface is a contract of what a class should look like when it will be created. It will tell what methods should be in a class, their and and their return type. You can see it as a specification or a contract of what a class should contain

Let's take an example from the game development world: We want to create game objects that can be moved around and drawn. Obviously depending on what you draw or what you move the implementation will be different. A car moves and draws differently than a player. 

```java
interface GameObject {
	void move();
  boolean draw(Canvas canvas);
}
```

Here we have defined an `interface` called `GameObject`. When a class `implements` this interface it should have two methods

1. One called `move` that should return a `int`.
2. One called `draw` that should return a `boolean`.



## Let's implement two different classes using the interface

When implementing an interface we use the `@override` annotation

```java
class Car implements GameObject {
  private double speed = 0;

  @Override
	public void move() {
    this.speed = this.speed + 100; // a car moves quick
  }
  
  @Override
  public boolean draw(Canvas canvas) {
    canvas.drawCircle(); // wheel one
   	canvas.drawCircle(); // wheel two
    // etc
    return carHasBeenDrawn; // true
  }
}
```



```java
class Player implements GameObject {
  private double speed = 0;
  
  @Override
	public void move() {
    this.speed = this.speed + 10; // a player moves slow
  }
  
  @Override
  public boolean draw(Canvas canvas) {
    canvas.drawCircle(); // head
    canvas.drawLine(); // arm
    canvas.drawLine(); // other arm
    // etc
    
    return playerHasBeenDrawn; // true
  }
}
```

The two classes `Car` and `Player` both adhere to the interface. That means they both implement two functions:

1. `move` that does not return anything
2. `draw` that has a parameter called `canvas` of the type `Canvas`. The method returns a boolean



## Abstract class

An abstract class is a class that can not be instantiated! 

It can contain both attributes and method with the method implementation. But no instantiation!

```java
abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    // functionality here aswell
    System.out.println("Zzz");
  }
}
```

```java
Animal elephant = new Animal(); // will generate an error
```

We have to use it like this:



**Elephant.java**

````java
public class Elephant extends Animal {
    @Override
    public void animalSound() {
				System.out.println("Elephant sounds");
    }
}
````

Notice the `extends` not `implements`! 

```java
Elephant elephant = new Elephant();
elephant.animalSound(); //Elephant sounds
elephant.sleep(); //Zzz
```



## Static keyword

Static variables can be accessed using just the class name. No need to instantiate the class! Static variables are shared among all instances of a class. 

Example is fx the `String.format` method

Typically refers to common property

Cannot reach `this`!



### When to use static?

- `main` method must be static
- When you want to have a variable that describes something about the class itself, not the individual objects of that class
- When you want to have a variable that *always* has the same value for *every* object of the class, forever and ever.
- If you have a method that does not use any instance variables or instance methods, you should *probably* make it `static`



```java
public class Elephant extends Animal {
  	public static String animalName = "Elephant";
    @Override
    public void animalSound() {
				System.out.println("Elephant sounds");
    }
}
```



```java
System.out.println(Elephant.animalName); // Elephant
```

No need for instantiating the `Elephant` class. `animalName` is available on the class itself 😱



## Exercises

