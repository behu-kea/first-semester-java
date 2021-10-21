# Tuesday

This week will be focused on Java basics

Read and solve the exercises found in [Methods](../../topics/03-programflow/methods.md)



## Peer instruction



### Question 1 - 3 minutter

What is the value of `numberOfCharacters`?

```java
public class Question1 {
    public static void main(String[] args) {
        double numberOfCharacters = getNumberOfCharacters("Kea er sej");
    }

    public static int getNumberOfCharacters(String word) {
        System.out.println(word.length());
    }
}
```

- a) `9`
- b) `9.0`
- c) `10.0`
- d) Compilation error



### Question 2 - 3 minutter

What is the value of `sum`?

```java
public class Question2 {
  public static void main(String[] args) {
    int a = 3;
    int b = 6;
    double sum = sum(a, b);
  }

  public static double sum(double a, double b) {
    System.out.println(a + b);
  }
}
```

- a) `9`
- b) `9.0`
- c) `36`
- d) Compilation error



### Question 3 - 5 minutter

What is the value of `sum3`

```java
public class Question3 {
  public static void main(String[] args) {
      int a = 4;
      int b = 2;
      double sum1 = sum(a, b);
      double sum2 = sum(b, a);
      double sum3 = sum1 + sum2;
  }

  public static double sum(int a, double b) {
      return a * b;
  }
}
```

- a) `8`
- b) `16.0`
- c) `8.0`
- d) Compilation error



### Question 4 - 5 minutter

What is the value of `subtraction`

```java
public class Question4 {
  public static void main(String[] args) {
    int a = 7;
    int subtraction = (int) isOdd(a);
  }

  public static double isOdd(int a) {
    return a % 3;
  }
}
```

- a) `true`
- b) `1`
- c) `1.0`
- d) Compilation error
