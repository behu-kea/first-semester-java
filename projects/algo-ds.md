# Algorithm + Data Structures Mandatory

#### 1. In your own words: Describe each data structure in your own words (200 words each max pr. item)

- Array
- Arraylist
- Stack
- Queue

#### 2. Popular girlnames

The following .csv file contains data from 2021 representing the most popular girlnames of the year so far. Your task is to create a class that represents a girlname with attributes: place & name.

- Read each entry from the file
- Map the data to attributes in an object
- Add all objects to a list
- Sort the list by length of name

Data: [girlnames.csv](assets/girlnames.csv) 

#### 3. (Advanced - optional) Password corruption

A password database seems to be corrupted: some of the passwords are not allowed by official policy that was in effect when they were chosen.

To solve the problem, they have created a list (your input) of *passwords* (according to the corrupted database) and *the policy when that password was set*.

For example, suppose you have the following list:

```
1-3 a: abcde
1-3 b: cdefg
2-9 c: ccccccccc
```

Each line gives the password policy and then the password. The password policy indicates the lowest and highest number of times a given letter must appear for the password to be valid. For example, `1-3 a` means that the password must contain `a` at least `1` time and at most `3` times.

In the above example, `*2*` passwords are valid. The middle password, `cdefg`, is not; it contains no instances of `b`, but needs at least `1`. The first and third passwords are valid: they contain one `a` or nine `c`, both within the limits of their respective policies.

*How many passwords are valid* according to their policies?

- Both answer & source code should be included in this

Small test-dataset:  

[small-password](assets/small-password.txt) 

Large dataset: 

[large-password](assets/large-password.txt) 
