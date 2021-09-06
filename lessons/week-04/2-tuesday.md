# Tuesday

Read and solve the exercises found in [conditionals](../../topics/03 - programflow/conditionals-boolean.md)



## Peer instrcution

### Question 1

What are the values of salaryand taxesafter execution of the following code? 

```java
double taxes = 50000.0;
double salary = 50000.0;

if (salary > 15000.0) {
    taxes = salary * 0.50;
} else {
    taxes = salary * 2;
}
salary -= 25000.00;
System.out.println(taxes + ", " + salary);
```

1. `50000.0, 25000.0`
2. `0.0, 0.0`
3. `25000.0, 25000.0`
4. `25000.0.0, 0.0 `
5. None of the above



### Question 2

What are the values of salaryand taxesafter execution of the following code? 

```java
double taxes = 50000.0;
double salary = 50000.0;

if (salary > 15000.0) {
  taxes = salary * 0.50;
}
if (salary > 30000.0) {
  taxes = salary * 2;
}
salary -= 25000.00;
System.out.println(taxes + ":" + salary);
```

1. `25000.0, 20000.0`
2. `100000.0, 25000.0`
3. `100000.0, 50000.0`
4. `25000.0, 15000.0 `
5. None of the above

