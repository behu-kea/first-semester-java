# Interfaces

In Java we can create 





## Abstract classes



## Static keyword

Static variables can be accessed using just the class name. No need to instantiate the class! Static variables are shared among all instances of a class. 

Example is fx the `String.format`method

Typically refers to common property

Cannot reach `this`!



### When to use static?

- `main` method must be static
- When you want to have a variable that describes something about the class itself, not the individual objects of that class
- When you want to have a variable that *always* has the same value for *every* object of the class, forever and ever.
- If you have a method that does not use any instance variables or instance methods, you should *probably* make it `static`

