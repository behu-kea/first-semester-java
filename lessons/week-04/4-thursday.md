# Thursday



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

1. `50000.0, 20000.0`
2. `50000.0, 15000.0`
3. `25000.0, 20000.0`
4. `25000.0, 15000.0 `
5. None of the above



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
public class Test {
    public static void main(String[] args) {


        int iArray[] = {3, 4, 5, 6, 7};
        myMethod(iArray);
    }

    static void myMethod(int a[]) {
        for (int i = 1; i < a.length - 1; i++) {
            a[i] /= 2;
        }
    }
}
```

1. `3, 4, 5, 6, 7`
2. `1, 2, 2, 3, 3`
3. `3, 2, 2, 3, 3 `
4. `1, 2, 2, 3, 7`
5. `3, 2, 2, 3, 7`

