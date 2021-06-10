# Debugging

Developing software can sometimes be extremely frustrating. You maybe have an error and you dont understand why. Debugging is the process of fixing error systematically. Developers spend probably 80% on debugging and 20% on actual development. 

Lucikly IntelliJ has some tools that can help us with the process!



## IntelliJ debugger

The Debugger is a tool that can help understanding your code. It works by indicating a place or multiple places in the code you want the code to stop and figure out what the values of our variables are. These places are called breakpoints. 



### Setting a breakpoint

To set a breakpoint in IntelliJ click to the right of the line number. Now a red dot should appear



![Set a breakpoint](../../assets/set-breakpoint.png)



### Starting the debugger

Next to the green play icon that runs your code, there is a small little green bug. Clicking this will start the debugger. 

![Start debugging](../../assets/start-debugger.png)



### Working with the debugger

Now the debugger is running and there are a couple of things to notice:

- The first thing is that all the variables in the code has their value displayed inline to the right the variable. That is super helpful!

- The second thing to see is that in the bottom where the console normally is there is a new window. To the right of that window is the list of the variables and their values. 
- The third thing to see when hovering any expressions the value of that expression is shown!
- The fourth thing is that the line that is highlighted with blue is the current debugger line. That is how far the debugger has reached

![Debugger variable values](../../assets/debugger-variable-values.png)





### Controlling the debugger

The highlighted area in the image below shows the controls of the debugger. Let's go through them below

![CleanShot 2021-06-09 at 15.43.03@2x](../../assets/controlling-the-debugger.png)



- <img src="../../assets/step-into.png" alt="CleanShot 2021-06-09 at 15.51.16@2x" /> Step into - Will either go to the next line that is executed **or** go into a method if the current line is a method call
- <img src="../../assets/step-over.png" alt="CleanShot 2021-06-09 at 15.49.31@2x"/> Step Over - If the current line is a method call you can step over that method call (not debugging inside that method)
- <img src="../../assets/force-step-into.png" alt="CleanShot 2021-06-09 at 15.52.16@2x" /> Force step into - If there is a method call no matter the type of method call it will step into that
- <img src="../../assets/step-out.png" alt="CleanShot 2021-06-09 at 15.53.15@2x" /> Step out - Will step out of the method that the debugger is in
- <img src="../../assets/step-to-cursor.png" alt="CleanShot 2021-06-09 at 15.54.24@2x" /> Step to cursor - Will step into where the cursor is



With these tools you can hopefully easier debug your program to find out what is going wrong.

