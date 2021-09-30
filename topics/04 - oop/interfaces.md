# Interfaces

Watch this video as support 👇

https://youtu.be/yk0e6R3RcDo



An interface is a contract of what a class should look like when it will be created. It will tell what methods should be in a class, their and and their return type. You can see it as a specification or a contract of what a class should contain

Let's take an example from the game development world: We want to create game objects that can be moved around and drawn. Obviously depending on what you draw or what you move the implementation will be different. A car moves and draws differently than a player. 

```java
interface GameObject {
  void move();
  boolean draw(Canvas canvas);
}
```

Here we have defined an `interface` called `GameObject`. When a class `implements` this interface it should have two methods

1. One called `move` that should not return anything.
2. One called `draw` that should return a `boolean`.



## Let's implement two different classes using the interface

When implementing an interface we use the `implements` keyword, not `extends`! Another thing to note is that we use the `@override` annotation. This is used to show that we over

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

An abstract class is a class that can not be instantiated! Let's take an example with `Animal`. Animal is an abstract category. making a `new Animal` does not make sense. Because we want animals like `Elephant`, `Cat` or `Dog`. You have to be a specific animal and not just an `Animal`. In this case we can use abstract classes because instantiating `Animal` does not make sense.

Abstract classes can contain both attributes and method with the method implementation. But no instantiation!

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



## Exercises



### Exerices 1 - level 1

https://w3.cs.jmu.edu/spragunr/CS159_F13/activities/interface_review/interface_worksheet.shtml



### Exercise 2 - level 1

Create an interface called FastFood (with appropriate methods) and create a `Sandwich` class, a `Pizza` class and a class you decide that implements the FastFood interface.

Add some different `Fastfood` objects to an array. Now iterate through that array and use some of the methods you have created above. 



### Exercise 3 - level 1

Create a class that implements the following interface. Now create two objects using the class created

```java
interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
```



### Exercise 4 - level 2

Write  an  abstract  class  called  `Animal`.   An  animal  has  3  attributes:  `name`, `nrOfLegs`  & ` isMammal`.  Animals  can  also  produce  sounds  (represented  as  astring of the sound), and every animal produces a unique sound.

Create 3 animal classes that all extends the abstract Animal class and overrides the method producing their unique sound.

Create an array, add your animals to the list and print every animals sound



### Exercise 5 - level 3

Det her er en stor opgave i ikke bliver færdige med. Men i kan gå igang med den. Den læner sig ikke nødvendigvis op af abstrakte klasser eller interfaces, men måske i kan finde et godt sted at bruge det!?

https://kea-fronter.itslearning.com/LearningToolElement/ViewLearningToolElement.aspx?LearningToolElementId=809533

