# Method overload



It is possible to create methods with the same name, when the parameters are different! 

```java
class CalculateSquare {
    public void square() {
        System.out.println("No Parameter Method Called");
    }

    public int square(int number) {
        return number * number;
    }

    public float square(float number) {
        return number * number;
    }

    public double square(double number) {
        return number * number;
    }

    public static void main(String[] args) {
        CalculateSquare obj = new CalculateSquare();
        obj.square();
        obj.square(5);
        obj.square(2.5);
    }
}
```

So these methods have the same name `square` but because their parameters are different they are seen as different mathods. When one of the methods gets called, then relevant methods will be found based on the argument. Fx

```java
obj.square(5);
```

This will be directed to this method, becaus we are callin the method with an integer

```java
public int square(int number) {
		return number * number;
}
```

The same can be done with a constructor!

```java
public class UserInheritance {
    private String username;
    private String password;

  	// First constructor takes two strings
    public UserInheritance(String username, String password) {
        this.username = username;
        this.password = password;
    }

  	// The second constructor takes nothing
    public UserInheritance() {
      	this.username = "abd";
    }
}
```

Here we use the different constructors

```java
UserInheritance mieParker = new UserInheritance("Mie Parker", "fairydust");
UserInheritance otherUser = new UserInheritance();
```

