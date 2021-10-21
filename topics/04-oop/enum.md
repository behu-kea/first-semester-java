# Enum



An `enum` is a special "class" that represents a group of  **constants** (unchangeable variables, like `final` variables)

We create an enum by making a new java class and writing the following:

```java
enum Level {
  LOW,
  MEDIUM,
  HIGH
}
```

Lets say we wanted to represent rock, paper, scissors. Since there cannot be any other hands to play than those three it would make a lot of sence to represent this as a `enum`

```java
enum RockPaperScissor {
  Rock,
  Paper,
  Scissor
}
```

