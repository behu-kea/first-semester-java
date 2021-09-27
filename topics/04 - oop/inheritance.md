# Inheritance

Watch this video as support 👇

https://youtu.be/yXzoxxIYfgQ





## 4 pillars of OOP inheritance

![4 pillars of abstraction](../../assets/4-pillars-of-abstraction.png)



![Inheritance concept](../../assets/inheritance-concept.png)



## Why does inheritance make sense

![Inheritance Problem](../../assets/inheritance.png)

Because we dont want to repeat ourselves. D.R.Y. - Dont repeat Yourself

- All users should have a username and a password and all users should be able to generate a new password. 
- Only the Admin has a email attribute and can show statistics

![Inheritance implemented](../../assets/inheritance-implemented.png)



### Lets try and create this without inheritance



**User.java**

```java
public class User {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword() {
        return "asd123";
    }
}
```



**PremiumUser.java**

```java
public class PremiumUser {
    public String username;
    public String password;

    public PremiumUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword() {
        return "asd123";
    }

    public boolean putInBasket(int discount) {
        return true;
    }
}
```



**AdminUser.java**

```java
public class AdminUser {
    public String username;
    public String password;
    public String email;

    public AdminUser(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String generateNewPassword() {
        return "asd123";
    }

    public String showStatistics() {
        return "Fancy statistics";
    }
}
```

This code should not be to foreign for you. We create 3 classes that have different attributes. **But** we are repeating ourselves quite a lot. That is **always** a bad sign when programming!





### Now lets try with inheritance

lets try and simplify the code using inheritance



**User.java**

```java
public class User {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword() {
        return "asd123";
    }
}
```



**PremiumUser.java**

```java
public class PremiumUser extends User {
    public PremiumUser(String username, String password) {
        super(username, password);
    }

    public boolean putInBasket(int discount) {
        return true;
    }
}
```



**AdminUser.java**

```java
public class AdminUser extends User {
    public String email;

    public AdminUser(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public String showStatistics() {
        return "Fancy statistics";
    }
}
```

There are two key parts to this! 

- `extends` - Tells Java that the `PremiumUser` and `AdminUser` should extend the functionality of `User`. In other words they will inherit the functionality of `User`!
- `super` see below
- The last thing we do is to take the `email` from the constructor and set that to `this.email`.



### `super`

`super` refers to the instance of the parent class. It works like `this`. The difference is that `this` referes to the object of the class where `super` refers to the object of the parent class!

Lets look at the example above again

In order to get the attributes and methods of the `User` class we have to initialize the object using the constructor! This we do by writing

```java
super(username, password);
```

This is the same as doing this: `new User("benjamin", "asd123")`!

So when we have called `super(username, password);` the `AdminUser` now has access to the attributes and method of `User`!

It is possible to write `super.generateNewPassword()` because `super` simply refers to the parent class which is `User`.



### Let's use the new inherited classes!

```java
public class Main {
    public static void main(String[] args) {
        User mieParker = new User("Mie Parker", "fairydust");
        System.out.println(mieParker.generateNewPassword()); // asd123
        PremiumUser jonPedersen = new PremiumUser("Jon pedersen", "shhh!");
        jonPedersen.putInBasket(200); // true
        AdminUser jensFraIt = new AdminUser("Jens pedersen", "password123", "jens-fra-it@cmoneycorp.com");
        jensFraIt.showStatistics(); // Fancy statistics
    }
}
```



## Relationships

There are different relationships between objects. The replationships can help decide how we should structure our application. 



### Is a

The is a relationships is fx

- An Apple is a fruit. So we could maybe have base class `fruit` and `apple` as child class
- A Volvo is a car. So again a class `volvo` inherits from `Car`



### Has a 

This meant that a class references another class. Fx what if the a `Cat` has a favourite food that is another class?

```java
class Cat {
    public String name;
    public int mood;
    public boolean isHungry;
    public int energy;
  	public Food favoriteFood;

  public Cat(String name, int mood, boolean isHungry, int energy, Food favoriteFood) {
      this.name = name;
      this.mood = mood;
      this.isHungry = isHungry;
      this.energy = energy;
    	this.favoriteFood = favoriteFood;
  }

  public void meow() {
      System.out.println("meow");
  }
}
```

Now the cat **has a** favorite food. 



### Override

In the example above there is a method called `generateNewPassword` it simply returns the same password for each user objects. So if a `user`, `PremiumUser` or `AdminUser` gets a new password they would get the same password. This is off course a problem. In a real world scenario the `generateNewPassword` off course would generate a new password. **But** let's use this as an opportunity to talk about overriding methods. 

In the `generateNewPassword` what if the `PremiumUser` and the `AdminUser` could override the `generateNewPassword` method. Let's do that for the `AdminUser` 👇

```java
public class AdminUser extends User {
    public String email;

    public AdminUser(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    public String showStatistics() {
        return "Fancy statistics";
    }

    @Override
    public String generateNewPassword() {
        return "new admin password";
    }
}

```

There are two relevant things here

1. The `@override` annotation tells Java that  the child class method (`AdminUser` is a child of `User`)  overrides the parent class method (`User`) 
2. `public String generateNewPassword() {` - simply writing the same method overrides the method from the parent class. `@override` is not necessary, but it's good practice to have it!



Now at least the individual child classes have their own `generateNewPassword` method



## Exercises



### Exercise 1

#### `Car`

Create a super class called `Car`. The `Car` class has the following fields and methods. 

- `speed`
- `regularPrice`
- `color`
- `getSalePrice()`



#### `Truck`

Create a sub class of `Car` class and name it as `Truck`. The `Truck` class has the following fields and methods. 

- `weight`
- `getSalePrice()`

If the weight of a `Truck` is more than 2000 kg then there is a discount of 10% otherwise 20%



#### `Ford`

Create a subclass of `Car` class and name it as `Ford`. The `Ford` class has the following fields and methods 

- `year`
- `manufacturerDiscount`
- `getSalePrice()`

If a `manufacturerDiscount` is set then the salesPrice will be that much cheaper



#### `Sedan`

Create a subclass of `Car` class and name it as `Sedan`. The `Sedan` class has the following fields and methods. 

- `length` 
- `getSalePrice()`

If the `length` is more than 20 meters then 5% discount otherwise 10% discount



#### `AutoShop`

Create `AutoShop` class which contains the `main()` method. Perform the following within the `main()` 
method. 

- Create an instance of `Sedan` class and initialize all the fields with appropriate values. Use `super(...)` method in 
  the constructor for initializing the fields of the superclass. 
- Create two instances of the `Ford` class and initialize all the fields with appropriate values. `Use super(...)` 
  method in the constructor for initializing the fields of the super class. 
- Create a `Truck` instance
- Create an instance of `Car` class and initialize all the fields with appropriate values. Display the sale prices of all instance.



### Exercise 2

First create a `Person` class. A Person class tracks age and name of a person

Now create a 

Employee inherits from Person

Person
