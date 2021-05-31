# Conditionals

Conditionals is a way for a computer to handle decisions. Given some condition the program should be able to account for that. This is done using something called a conditions conditional statement. 



## Conditional statements

Conditional statments is the mechanism for which a computer takes decisions. The most typical conditional statement is a **if sentence**. Lets look at an example



### If sentence

```java
boolean isSunShining = true;
if (isSunShining) {
  System.out.println("The sun is shining ☀️");
}
```

Here we first define the `boolean` variable `isSunShining` to be `true`. Then we comes the if sentence. Only if `isSunShining` is `true` the code within the brackets (`{}`) will be executed. 



![If sentence](../../assets/if-sentence.png)



### If else sentence

But what if we wanted to print something else if the sun it **not** shining? For that we add an `else`:

```java
boolean isSunShining = false;
if (isSunShining) {
	System.out.println("The sun is shining ☀️");
} else {
	System.out.println("The sun is not shining 🌧️");
	System.out.println("Oh no ☹️");
}
```

*Try on [Pythontutor](http://www.pythontutor.com/java.html#code=public%20class%20YourClassNameHere%20%7B%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20boolean%20isSunShining%20%3D%20false%3B%0A%20%20%20%20%20%20if%20%28isSunShining%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20sun%20is%20shining%20%E2%98%80%EF%B8%8F%22%29%3B%0A%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20%20System.out.println%28%22The%20sun%20is%20not%20shining%20%F0%9F%8C%A7%EF%B8%8F%22%29%3B%0A%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)*

Now when `isSunShining` is `false` the code within the brackets after the `else` will be executed. 



Here is a flow diagram showing how if-else sentence works:

![If else flow diagram](../../assets/if-else-flow-diagram.png)



## If, else if, else

Spend some time in a group investigating how if, else if, else works. The group has to present to another group.



JEG SYNTES IKKE VI SKAL UNDERVISE SWITCH. DET SKAL DE NOK SELV FINDE UD AF NÅR DE HAR BRUG FOR DET!!



## Real world example

Lets create a more real world example before moving on to exercises

```java
int userAge = 13;
int accountAmount = 100;
// Lets say this comes from the user
int accountToWithdraw = 50;
boolean canUserWithdraw = accountAmount - accountToWithdraw > 0;

if (userAge >= 13 && canUserWithdraw) {
    System.out.println("Withdrawing " + accountToWithdraw + " dollars 💵");
} else {
    System.out.println("Sorry you cannot withdraw any money");
}
```

*Try on [Pythontutor](http://www.pythontutor.com/java.html#code=int%20userAge%20%3D%2013%3B%0Aint%20accountAmount%20%3D%20100%3B%0A//%20Lets%20say%20this%20comes%20from%20the%20user%0Aint%20accountToWithdraw%20%3D%2050%3B%0Aboolean%20canUserWithdraw%20%3D%20accountAmount%20-%20accountToWithdraw%20%3E%200%3B%0A%0Aif%20%28userAge%20%3E%3D%2013%20%26%26%20canUserWithdraw%29%20%7B%0A%20%20%20%20System.out.println%28%22Withdrawing%20%22%20%2B%20accountToWithdraw%20%2B%20%22%20dollars%20%F0%9F%92%B5%22%29%3B%0A%7D%20else%20%7B%0A%20%20%20%20System.out.println%28%22Sorry%20you%20cannot%20withdraw%20any%20money%22%29%3B%0A%7D&cumulative=false&heapPrimitives=nevernest&mode=edit&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)*

Can you think of an example using if, else if, else?



## Exercises



## Switch



