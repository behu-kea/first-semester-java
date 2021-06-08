# Methods

When writing Java we often times have to do repetitive tasks. 

- Check that this user is logged in
- Get all the comments for a specific Post
- Create a new user



 Methods help us manage these repetitive tasks



## Lets begin with a good old metaphor

Imagine you have a huge machine. The machine has lots of things you can control. Like a lever, 3 buttons, a pulley and wheel and much more. All of this affects what happens inside the machine. It works by giving the machine some input. Now the input is transformed through the machine and in the end you get an output. 



![Machine](../../assets/machine.png)



Imagine now that the machine is actually a **method**, the inputs in Java is called **arguments**, the things that control the method are called **parameters**, the output of the machine is called a **return value**. That might not make a lot of sense for now, but keep the metaphor of the machine, it will get handy later on!



## Working with methods



### Creating a method

Let's create a method that will double any number we give it!

```java
public static int doubleNumber(int number) {
		return number * 2;
}
```

Let's disect the code

- `public` and `static` - these two keywords will later on become meaningful for you. But for now they are not so relevant. 
- `int` - Tells Java that the method will return an integer
- `doubleNumber` - This is the name of the method. It could be called anything
- `(int number)` - Inside the paranthesis we put the parameters of the method. 
- `return number * 2;` - Inside the brackets is the code the method will run (called the body of the method). `return` tells Java to return a value when the method runs. In this example number times two



![Parts of creating a method](../../assets/method-explanation.png)

A method does not have to return anything. If it does not return anything we use the keyword `void`. As in the method is void(missing) of any return.

```java
public static void sayHi() {
    System.out.println("Hi!");
}
```



### Calling a method

**So** what we have created now is a method that can double numbers. But how can i use it? How do i activate it somehow??

To activate a method is in Java called to call a method. So lets try and call `doubleNumber` with a specific number!



```java
int integerThatIsDoubled = doubleNumber(4);
System.out.println(numberThatIsDoubled); // 8
```

- `int integerThatIsDoubled` - is a variable that will capture the returned value from the method
- `doubleNumber(4);` - Here we call the method by writing the name of the method followed by parenthesis. What is inside the paranthesis is called an argument (remember the machine input metaphor!)



![Method flow](../../assets/method-flow.png)

---



Let's take another example!

```java
public class main {
    public static void main(String[] args) {
        String fullname1 = getFullName("Sharmila", "Jensen");
        System.out.println(fullname2); // Sharmila Jensen

        String fullname2 = getFullName("Mads", "Hansen");
        System.out.println(fullname2); // Mads Hansen
    }

    public static String getFullName(String firstname, String lastname) {
        return firstname + " " + lastname;
    }
}
```

Here we create a method called `getFullName` that add's two string together with a space in-between. The method is called twice. 

The parameters take on the value that the method is called with! Or put in another way they are substituted with the values the method is called with.

The first time the two parameters `firstname` and `lastname` is substituted for `"Sharmila"` and `"Jensen"`. The second time they are substituted for  `"Mads"` and `"Hansen"`

The returned value from calling the method is captured by `fullname1` and `fullname2`



![CleanShot 2021-06-08 at 11.04.29@2x](../../assets/method-definitions.png)



## Method scope

Method scope works in the same way as block scope. This means that a variable defined within a method is not accessible outside that method. 



````java
public static void sayHi() {
		String hiString = "Hi!"
    System.out.println(hiString);
}

System.out.println(hiString); // hiString is not defined within this scope!
````





## Exercises

https://kea-fronter.itslearning.com/LearningToolElement/ViewLearningToolElement.aspx?LearningToolElementId=851956

https://kea-fronter.itslearning.com/LearningToolElement/ViewLearningToolElement.aspx?LearningToolElementId=853066

Todays exercises will be done as pair programming! We will set a timer. For the groups if you have found a good pair programming partner then partner up with them. The rest we will randomnly assign. 



### Exercise 1 - 1 hour

In this exercise we will be using FeelJava to create method that can generate a face. You can watch a small video about FeelJava here: https://www.youtube.com/watch?v=YRSCFqIvUOo

Download FeelJava here: https://www.dropbox.com/s/5ji2fmthdm5a2eh/feeljava0.7.jar?dl=1

Open FeelJava and in the top, click on `graphics -> Circle`. Now you are ready to create your own face! 

Create a method that can generate a face. The method should have relevant parameters that control the face. This is a very open task and you choose how to do it. Creativity is appreciated 🤩



Here is an example of how a method could look. 

```java
public void generateFace(Canvas cv, boolean isSmiling, int numberOfEyes, String hairColor) {
   	...
}
```

To figure out how to draw different shapes take a look at this article: https://edencoding.com/javafx-canvas/



![Faces](../../assets/faces.png)



Continue in the pair programming pairs.



### Exercise 1.1

Write a method that takes three integers as parameter, sums the integers and returns the result.



### Exercise 2

Write a method that takes a String as parameter and prints the String thrice.The method does not return a value.



### Exercise 3

Implement  a  BMI  calculator  in  the  scope  of  a  method.   Identify  the  needed parameters and return type.



### Exercise 3.1





### Exercise 4

Write a method that takes a String as parameter and returns the String in full uppercase.



### Exercise 5

Write  a  method  that  takes  a  String  as  parameter  and  returns  the  amount  of characters in the given String.

*Hint:  Use a method called `[string].length();`to identify the length of a String.*



### Exercise 6

Lav en `void` metode, der tager to strenge som parametre og udskriver disse på skærmen på samme linje adskilt af et mellemrum.



### Exercise 7

Lav en void metode, som skriver en personlig velkomsthilsen inkl. dags dato på skærmen. Du kan lave en af disse varianter: 

-  Dags dato hardkodes i main og gives som argument, når metoden kaldes. 

- Dags dato genereres automatisk inde i metoden på følgende måde  (LocalDate klassen1 skal importeres, men det hjælper IntelliJ med):  

 ```java
 LocalDate today = LocalDate.now();
 ```



### Exercise 8

Du skal have dit program til at foretage flg. output til skærm med  kun ét metodekald i main (du har metoderne nedenfor til rådighed) 

 

 ```java
 public static void m1() {
     System.out.print("Der ");
 }
 
 public static void m2() {
     m1();
     System.out.print("var ");
 }
 
 public static void m3() {
     m2();
     System.out.print("engang");
 }
 ```



### Exercise 9

Lav en metode, der modtager en streng og returner et heltal, der angiver strengens længde. 

Hint: String klassen har en metode `length()` til netop dette formål. 

Eksempel: 

```java
String text = "Hello World";
int antalTegn = text.length(); 
```



### Exercise 10

Lav en void metode uden parameter kaldet `throwDice`. Dvs. metoden returnerer ikke noget og modtager ingen input. 

Metoden skal generere et tilfældigt tal ml. 1 - 6 og udskrive det på skærmen.



### Exercise 11

Lav en metode, der modtager en streng, og returnerer strengen skrevet med store bogstaver.