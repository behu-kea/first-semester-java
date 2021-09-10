# 4 pillars of OOP

Java has 4 pillars it is built upon 👇



![4 pillars of OOP](../../assets/4-pillars-of-oop.png)



Lucky for you we have already talked about 2 out of the 4 pillars. That is:

- Abstraction - Abstraction is about abstracting code away. This can be achieved by creating methods, creating an `Interface` or an `Abstract` class. 
- Inheritance - The inheritance pillar is obvioulsy about inheritance and how objects can inherit properties from another object



The 2 pillars we have not talked about are

- Encapsulation - How we can control what objects can see and interact with data inside another object. 
- Polymorphism - How methods and classes can act in different ways. It means one name many forms. 



Let's first talk about Encapsulation!



## Encapsulation

Let's again use the `User` class from earlier!

```java
public class UserInheritance {
    public String username;
    public String password;

    public UserInheritance(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword() {
        return "asd123";
    }
}
```

You have learned about most of creating a class but we have not talked about the `public ` keyword. 

`public` is a access modifier that tells Java who have access to the attribute. In this example `username`, `password` and `UserInheritance` (the constructor) and `generateNewPassword` are public. That means that all those attributes and methods can be called on the object.

```java
User mieParker = new User("Mie Parker", "fairydust");
System.out.println(mieParker.username); // Mie Parker
System.out.println(mieParker.password); // fairydust
System.out.println(mieParker.generateNewPassword()); // asd123
```

Accessing the attributes `username` and `password` is not good because all the data that is inside the `mieParker` object can be accessed by everone that has the object. 



### Let's improve this using encapsulation





Let's make it a bit more concrete and real world 👇



### Concrete encapsulation with cpr-number

Imagine that a `User` has a cpr-number. It should not be possible to change the cpr-number! Lets also make the other attributes `private`

```java
public class UserInheritance {
    private String username;
    private String password;
    private String cprNumber;

    public UserInheritance(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String generateNewPassword() {
        return "asd123";
    }
}
```

Now this is not possible:

```java
User mieParker = new User("Mie Parker", "fairydust");
System.out.println(mieParker.username); // Java error
System.out.println(mieParker.password); // Java error
```





## Polymorphism

