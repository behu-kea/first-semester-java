# Strings

A string is a data type used for handling text. An example is saving the text Hello World. 

```java
String hello = "Hello world";
```



More precisely are strings:

- Non-primitive/complex data types
- Class/object
- Indexed sequence of characters
- Notated by double quotes







We can even add strings together:

```java
String firstname = "Benjamin ";
String lastname = "Hughes";
String fullname = firstname + lastname;
System.out.println(fullname); // Benjamin Hughes
```



## Primitive data types





## String methods

We can manipulate a `String` in lots of diferent ways. We can do that through string methods. If we create a String and press `.` after, then IntelliJ will autocomplete with a list of methods we can call on a string. 

![String methods](../../assets/string-methods.png)

There is also a list of methods here: https://www.w3schools.com/java/java_ref_string.asp



Lad os tage nogle eksempler

```java
String lastname = "Hughes";
lastname.toUpperCase(); // HUGHES
lastname.charAt(2); // g
lastname.length(); // 6
```



### Exercise 1

In a group investigate 2 string methods. You need to be able to explain what the method does but also how to use it in Java!



### Exercise 2

Write a method that prints out `Hello World` 3 times





## Execise 2

Mere konkrete opgaver

https://www.w3resource.com/java-exercises/string/index.php