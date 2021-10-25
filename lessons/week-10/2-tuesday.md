# Tuesday

Algorithms, precise instructions on how to to accomplish a specific task, are at the core of computer science. In the context of programming, algorithms are typically defined using source code.

The concept of *efficiency* is often associated with algorithms. A programs efficiency, i.e, the computation of required information fast enough, is an integral part of a programs usability. If it took two days for an algorithm designed for forecasting tomorrows weather run, the results wouldn't be very useful! Similarly, a user viewing a TVs program guide won't get any use out of it, if the tv-shows info only loads after the show already ended.

In a more general sense, retrieving and displaying information quickly is an integral part of any applications function. Next let's explore algorithms associated with sorting data. While the following examples utilize integers in arrays, the algorithms shown will also work with other data-structures meant for storing information, such as lists.



## Sorting information

If the information (data) giving to a computer, doesn't follow any rules and isn't in order, retrieving that information is taxing for the computer. We need order! Especially if we want to efficiantly search for elements either by a binary search algorithm or we need data elements displayed by a certain sorting condition such as news articles by date.

### Pair programming: Selection sort (1.5 hours)

Every programmer should be familiar with at least one sorting algorithm (i.e a way to sort an array). Let's familiarize ourselves with one "classic" sorting algorithm, the selection sort. We'll do so by writing a method that receives an array of integers as parameter and returns the sorted array.

This exercise can be solved in about 30 seconds if googled. The challenge & reward comes from solving it without any help other than pen, pencil & the person you are pair programming with.

https://youtu.be/3hH8kTHFw2A

###### Notes:

- Swapping two variables in an array can be tricky
- The best friend in this exercise is pen + paper

## Comparable interface

Another way of sorting is using the Comparable interface.

In todays class I will introduce the concept of the Comparable interface, which is another way of comparing & sorting objects.

https://beginnersbook.com/2017/08/comparable-interface-in-java-with-example/

###### Exercise

- Create a class called Person
- Each person has the following attributes: 
  - Name
  - Height
  - age
- Implement the comparable interface, with a natural ordering such that:
  - An older person is sorted higher in the natural ordering
  - If two persons are the same age, the taller person is sorted higher in the natural ordering

###### Advanced

- Create a class called RedditPost
- Each RedditPost has the following attributes:
  - DateCreated
  - Upvotes
  - Subject
- Implement functionality such that we are able to sort RedditPosts by their:
  - DateCreated
  - Upvotes
  - Subject

Use the Comparator Interface instead of Comparable: 

https://www.baeldung.com/java-comparator-comparable
