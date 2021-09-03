# Tuesday

This week will be focused on Java basics

Read and solve the exercises found in [Methods](../../topics/03 - programflow/methods.md)



## Peer instruction



### Question 1

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



### Question 2

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



### Question 3

What is the value of `sum3`

```java
public class Question3 {
  public static void main(String[] args) {
      int a = 3;
      int b = 6;
      double sum1 = sum(a, b);
      double sum2 = sum(b, a);
      double sum3 =  sum1 + sum2;
  }

  public static double sum(int a, double b) {
      return a * b;
  }
}
```

- a) `18`
- b) `36.0`
- c) `18.0`
- d) Compilation error



### Question 4

What is the value of `subtraction`

```java
public class Question4 {
  public static void main(String[] args) {
    int a = 5;
    int subtraction = (int) isOdd(a);
  }

  public static double isOdd(int a) {
    return a % 3;
  }
}
```

- a) `true`
- b) `2`
- c) `2.0`
- d) Compilation error
