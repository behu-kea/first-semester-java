# Class Diagrams

Aula is a collective entryway from parents & guardians for day-care, schools & after school clubs.

Today we are going to model & develop a proof of concept of the classes and relationships in the Aula System.

- In the inception phase, the following vision and have been identified:

*Aula is a web-based IT-system that enables parents & guardians to stay in contact with the day-care, school & after school clubs. It should enable communication by message-parsing, news sharing & administration by an institutional administrator*



**Interview facts**

In a series of interviews the following facts were uncovered:

- Every day-care, school & after school club has a single administrator
  - They cannot be registred in the system without an administrator
- The administrator have all communication between parent/guardian and institution
- All messages have a subject and text field
- A parent/guardian can send a message to the institution
- The institution can send a message to a single parent/guardian or all
- The institution can publish news



**Exercise:**

- Identify classes, attributes & relationships from the description
  - Nouns are a good way to identify potential classes
  - Verbs are a good way of identifying methods/behaviour
- Draw a class-diagram based on the vision & description
  - Focus on the relationships between the classes

- Code a proof of concept based on the description & Class Diagram
  - **It it not the focal area to write a "functional" system with a menu etc.**
  - It is the focal area to implement the class diagram with their relationships
- Reverse-engineer the project in Intellij
  - Compare with the design-diagram
