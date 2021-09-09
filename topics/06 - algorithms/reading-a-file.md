# Reading a file

Files are means of **persistance**. Peristance refers to the ability to keep, store & contain data, without a running program. 

When a program stops executing, all of the variables, data and state are effectively wiped from memory.

## File formats

Files have different formats - some are human readable such as .txt files others are meant to be read by a machine such as a .class file.

We will be working with .csv files.

 ![image-20210907104009867](reading-a-file.assets/image-20210907104009867.png)

A .csv file is structured as a table, meaning that it has columns & rows, each row representing an entity.

Each of the rows in the .csv file above represents a movie (entity) from IMDB.

## How to read files

The approach to reading files in java is to refer to the file on disk by its path.

The file is afterwards read by a scanner in a loop and each loop iteration refers to a line in the file.

Files can both be read word by word - or in our context line by line.

In the example we will be consuming a file line by line and printing it to the screen.

## Pseudo-code

**Refer to the file on disk**

**Read it with a scanner**

**While the scanners has input**

​	**Print the file**

## Setup

New directory created for resources such as data files

![image-20210907105656946](reading-a-file.assets/image-20210907105656946.png)

File placed in the folder (dragged and dropped)

![image-20210907105604704](reading-a-file.assets/image-20210907105604704.png)



## Code

```java
package algorithms.data.structures;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesExample {
    public static void main(String[] args) throws FileNotFoundException {
        File filmFile = new File("resources/film-imdb.csv");
        Scanner sc = new Scanner(filmFile);
        while(sc.hasNextLine()){
            String movieDetails = sc.nextLine();
            System.out.println(movieDetails);
        }
    }
}
```



## Notable code

Note the addition to the main method signature:

```java
public static void main(String[] args) throws FileNotFoundException {
```

This means we are throwing an **exception** - a potential for an error occurring in the progrm. In this case the error might be that the file: film-imdv.csv cannot be found.

All methods that are utilizing and reading a file by a scanner **must** handle the exception. For now we are handling the exception as shown in the example and not providing it any more attention.



## Exercise

**End product:**

A console based analysis program that scans large data-sets and provides the user with insight

## Components

**FileReader**: A class that reads a file with a method that returns an arraylist of movie objects

(1) Implement functionality such that you can print each movie string from the film-imdb.csv file

(2) Refactor the code such that each movie are stored as Movie objects in an arraylist

**Analysing the file**

Implements methods such that you can find the answers to the following questions:

- What movie has the longest name?
- How many movies are from the Star Trek franchise?
- What is the average length for a movie in hours?
- What is the maximum amount of words in a movie title?
  - Example:
  - Wagon master has 2 words
  - Tie Me Up! Tie Me Down! has 6 words
  - Tie Me Up! Tie Me Down! has the maximum amount of words of this 2 title example
- How many movies won awards? 

##### Advanced analysis

- What year won the most awards?
- How many movies are sequals?
- What movie has the most unique konsonant?

#### (Optional) Menu

- Write a menu that lets the user choose what question he/she wants answered

**If you finish fast - I have another data-set with advanced questions about Star Wars**