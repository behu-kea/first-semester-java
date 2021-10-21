# Monday

Today you will be building your own data structure - [a stack and a queue.](../../topics/06-algorithms/stack-queue.md)

In java - all data structures are considered objects, usually containing **state** and **behaviour** just as any other object.

Consider an Arraylist that contain strings as an example. The Arraylist is used as an object throughout programs as a practical facility that helps us refer to, parse and store strings in memory. 

```java
ArrayList<String> groceryList = new ArrayList<String>();
groceryList.add("Beans");
groceryList.add("Falafel");
groceryList.add("Chips");

//This should return the string "Beans"
String firstGrocery = groceryList.get(0);

//This should return the number 3
int groceryItems = groceryList.size();
```

The *abstraction*, way-if-thinking or mental model of this object should be that of a real-life list - we can add things to a list, remove things from a list and count the numbers of elements in the list. 

The internal data structure of an arraylist is an array - which means that inside of the Arraylist object, an array resides, which resizes according to the developers needs. As "users" of the list, we do not notice this happening, but if you investigate the ArrayList class, you will find that the Arraylist **grows** and **shrinks** it's array within to accommodate data elements.

> Snippet from java.util.ArrayList source code:

```java
private void add(E e, Object[] elementData, int s) {
      if (s == elementData.length)
        elementData = grow();
  		elementData[s] = e;
  		size = s + 1;
}
```

> 📣 Code translated into prose: If size of array (*s*) equals the length of the current array, the array (*elementData*) should grow to accommodate more objects (grow method not included in this snippet) 

## The task

The task is to implement the functionality of **either** a Stack or Queue data structure for storing cat objects. The interface are already defined, you should pick one of the two and implement the data structure. The Stack or Queue should rely on an array as their internal data structure.

For the basic requirements to be fulfilled, the stack or queue should contain *n* data-members decided at object initialization - as a parameter in the constructor.

###### Advanced:

Implement a resizeable Stack or Queue with a circular array as described in: 

https://youtu.be/8sjFA-IX-Wwa

#### The interfaces & Starting point

###### ArrayCatQueue

```java
public interface ArrayCatQueue {
    public void enqueue(Cat c);
    public Cat dequeue();
    public boolean isEmpty();
    public int size();
    public void display();
}
```

###### ArrayCatStack

```java
public interface ArrayCatStack {
    public void push(Cat c);
    public Cat pop();
    public boolean isEmpty();
    public Cat top();
    public int size();
    public void display();
}
```

###### Cat

```java
public class Cat {
    private String name;
    private int age;
    private static int catsInExistence;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        catsInExistence++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

