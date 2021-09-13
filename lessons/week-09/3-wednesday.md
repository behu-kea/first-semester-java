# Linear search, Binary search

### 1. Linear search

- Write a class: User
- User has 2 attributes:
  - Username
  - Password
- Create 10 objects of the User class with different usernames & passwords
- Write a program with two methods:
  - One that: Receives & returns a username from the console
  - Another that: Searches an arraylist with User-objects for a username provided in the console
    - If the User is found - return the User object
    - If the user is not found - return null

### 2. Binary search

- Write a class *RandomNumberGenerator* with a method that either returns: 
  - An array with the numbers 1-100 in ascending order
- **OR (Advanced)**
  - An array with *n* amount of **random numbers** in ascending order:

```java
public int[] getRandomIntegers(int n){
	//This method will return n random integers in ascending order
}
```

- Implement a method *binarySearch(int[] arrayToSearch, int numberToFind)* that searches for a number provided as argument
- The method should follow the logic of binary search: https://www.youtube.com/watch?v=T98PIp4omUA
  - If the number is found - return the index position
  - if the number is not found return -1
