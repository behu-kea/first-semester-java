# Classes

You have now learned all the necessary building blocks of Java. `String`, `int`, `forloop`, `methods`, `conditional` these are all blocks that we need to build Java. **But** in order to write code that is 

- Better structured
- Better abstracted
- More maintainable
- More secure

we need to talk about classes! 

It's an essential part of Java that allows us to represent data in a better way.



## But why??

Let's go through a concrete example where classes can help us writte better code. 

Let's say we have an application that works with students. It could be an application that creates schedules for a school. 

Let's say a student has a name, an age and an array of his/her grades. Lets try and represent that with the code we have learned so far:

```java
String studentName = "Cathrine Hansson";
int age = 23;
int[] grades = {10, 4, 7, 7};
```

Okay, so this kind of works. I could do some operations on the individual variables, like finding the highest grade. But now a new student comes in, hmm. Okay let's rewrite the code👇

```java
String studentName1 = "Cathrine Hansson";
int age1 = 23;
int[] grades1 = {10, 4, 7, 7};

String studentName2 = "Peter Jon";
int age2 = 27;
int[] grades2 = {12, 4, 4, 7};
```

Hmm okay that's not super nice. What if there were 200 students in the system, then i would have to create 200 students * 3 attributes = 600 variables. This would simply not work and would be **massively** error prone. So then what? In comes classes. 







