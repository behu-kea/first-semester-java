# GRASP Project

Github Link: https://github.com/nicklasdean/CoffeeCollective

**FORK FROM THIS LINK**

**Case description : In Groups of 2-4**

A Computer Science student from Copenhagen University has ended an internship at a famous danish coffee chain. This has (of course) resulted in a big spaghetti-code mess. Their last hope are students who actually know how to design and write clean and effective code aka. students from KEA Dat21A.

They are currently working on a proof-of-concept to make baristas reduntant by implementing a robotic barista, that takes orders, serves coffee and handles payment. 

For now the application has to be running as a java console application, but later it will implement voice-to-text.

The former interns has not left much documentation, as they claim the code-base to be self-documenting.

While performing changes in the code-base: **Write notes to yourself**

### Main task: Get it running & working

- As of now - the code is not running due to (probably) several bugs
- It seems that the statistics module is not calculating correctly, we need to fix that
- Even worse - rumour has it that some of the code base has a lot of **redundancy** 🙀

### Secondary task: Investigate the code-base with GRASP in mind

- It seems that the **Information Expert** pattern is violated several places. This results in **classes with low cohesion**
  - Identify violations of the information expert pattern and place attributes (data) and behaviour (method) the more appropriate places
  - Answer: Why are violations of the **information expert pattern** & **low cohesion** connected?
- It also seems that the former developers do not know of **polymorphism** by **inheritance**. Where could **polymorphism by inheritance** be implemented to simplify the codebase?

### (Advanced) Third task

- (Advanced) How can we implement the **controller** pattern in an application like this?
  - How are classes from the "controller"-folder used?
  - How do we define "Controller" classes (as by Larmans definition)?
  - How can it be implemented in this context?

### (Advanced) Receipt Database 

- After a user has finished their order - they can make a purchase. 
- We do not need to handle payment for now - but we should store each receipt as a file
