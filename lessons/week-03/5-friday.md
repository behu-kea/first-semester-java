# Friday



## Face creator

>  The games studio Activition has contacted KEA to get the sharpest minds to work on a problem they have. Sadly DAT21B was not available therefore DAT21A has gotten the task. 
>
> Activision is creating a new game but their face generation software has mysteriously dissapeared in a data fire. So now we have to create code for generating random faces. **LOTS** of random faces!



In this exercise we will be using FeelJava to create a method that can generate a face. You can watch a small video about FeelJava here: https://www.youtube.com/watch?v=YRSCFqIvUOo

Download FeelJava here: https://www.dropbox.com/s/5ji2fmthdm5a2eh/feeljava0.7.jar?dl=1

Open FeelJava and in the top, click on `graphics -> Circle`. Here is an example of how to draw a circle

---

Your task is to create faces by calling different methods. This is a very open task and you choose how to do it. Creativity is appreciated 🤩 Here are the requirements

- You should create more than 4 methods for this task
  - They all need to have parameters
  - Some should return values using `return` some should not
  - Example could fx be `public static void drawEyes(double distanceBetweenEyes, int numberOfEyes)`, `drawNose`, etc
- You should show that you can use different kinds of loops
- You should use an `if` `else` sentence
- Use the modules operator `%`
- The program should take input from the user



Here is an example of how a method could look. 

```java
public void generateFace(boolean isSmiling, int numberOfEyes, String hairColor) {
   	...
}
```

To figure out how to draw different shapes take a look at this article: https://edencoding.com/javafx-canvas/ or this youtube video: https://www.youtube.com/watch?v=vaXuK-RsT6E



![Faces](../../assets/faces.png)



### Continously generate new random faces

Now have a method that can be used to generate new faces. Now we need the randomness!

Every 2 seconds generate a new random face usign your `generateFace` method. Hopefully it will look super awesome 🖼👩‍🎨👨🏼‍🎨



## Handing in

The project code should be added to a public github repo. Hand in the github link on Fronter!

We will find a judge that will find the best face, and there will be a small price 🏆

