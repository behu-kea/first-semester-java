# Monday

Read and solve the exercises found in [arrays](../../topics/03 programflow/array.md)



## Peer instruction



### Question 1

Which of the following correctly declares and initialises an array?

1. `int array[] = {1,2,3,4,5};`
2. `short array[] = new short[4];`
3. `char array = {'a', 'b', 'c', 'd', 'e'};`
4. `double array[] = new double{11.1, 22.2, 33.3};`
5. `String array[] = new String[]{"Java", "Fortran", "C++"}`



### Question 2

Which of the following correctly increments all the elements of `array`

1. `for (int i = 0; i < array.length(); i++) array[i]++;`
2. `for (int i = 0; i < array.length; i++) array[i]++;`
3. `for (int i = 0; i < array.length; i++) array[i++]++;`
4. `array[0..array.length]++;`
5. `array++;`



### Question 3

What will the value of `array` be?

```java
public class Test {
    public static void main(String[] args) {
        int[] iArray = {3, 4, 5, 6, 7};
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

