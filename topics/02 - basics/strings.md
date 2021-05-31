# Strings

A string is a data type used for handling text. An example is saving the text Hello World. 



```java
String hello = "Hello world";
```

Remember to have double quotes around text you want to save in a string



We can even add strings together:

```java
String firstname = "Benjamin ";
String lastname = "Hughes";
String fullname = firstname + lastname;
System.out.println(fullname); // Benjamin Hughes
```



## String methods

We can manipulate a `String` in lots of diferent ways. We can do that through string methods. If we create a String and press `.` after, then IntelliJ will autocomplete with a list of methods we can call on a string. 

![String methods](assets/string-methods.png)

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



## Execise 2

Mere konkrete opgaver

https://www.w3resource.com/java-exercises/string/index.php