# No code Wednesday



## Peer instruction

Conditional, arrays, loops, methods, everything



### Exercise 1

Which of the following correctly declares and initialises an array?

1. `int array[] = {1,2,3,4,5};`
2. `short array[] = new short[4];`
3. `char array = {'a', 'b', 'c', 'd', 'e'};`
4. `double array[] = new double{11.1, 22.2, 33.3};`
5. `String array[] = new String[]{"Java", "Fortran", "C++"}`



### Exercise 2

What are the values of salaryand taxesafter execution of the following code? 

```java
double taxes, salary = 50000.0;
if (salary > 15000.0) {
    taxes = salary * 0.40;
} else {
    taxes = salary * 0.30;
}
salary -= 25000.00;
```



### Exerise 3

Which of the following correctly increments all the elements of `array`

1. `for (int i = 0; i < array.length(); i++) array[i]++;`
2. `for (int i = 0; i < array.length; i++) array[i]++;`
3. `for (int i = 0; i < array.length; i++) array[i++]++;`
4. `array[0..array.length]++;`
5. `array++;`



### Exercise 4

What will the value of `array` be?

```java
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        changeArray(array);
        System.out.println(array);
    }

    static void changeArray(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            array[i] *= 2;
        }
    }
}
```

1. `2,3,4,5,6`
2. `2,6,8,10,6`
3. `2,6,8,10,12`
4. `4,6,8,10,6`
5. None of the above



