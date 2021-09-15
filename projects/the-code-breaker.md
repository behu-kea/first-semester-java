# The code breaker!



Let's talk about codes!

Back in the day, like waaaaay back in the day the Romans had a problem. Getting secret messages from a sender (fx a emporer) to a receiver (an commander) was difficult. If the enemy got hold of the message it could cost lives and even empires to fall. Therefore Julius Ceasar invented a way to encode a message so that other people could not just read the message in cleartext. 

In this homework we will be working with how to decode and how to encode messages. 



## Number cypher

A number cypher takes a word and converts all charcters to numbers. The numbers are equal to the order of the character in the alphabeat. Here is an example:



### Encoder

Create a method called `numberCypherEncoder` that takes a `String` and encodes that `String`

```java
String benEncoded = numberCypherEncoder("ben");
System.out.println(benEncoded); //2;5;14

String helloEncoded = numberCypherEncoder("hello");
System.out.println(helloEncoded); //8;5;12;12;15
```



### Decoder

Create a method called `numberCypherDecoder` that takes a `String` and encodes that `String`

```java
String benEncoded = numberCypherEncoder("2;5;14");
System.out.println(benEncoded); //ben

String helloEncoded = numberCypherEncoder("8;5;12;12;15");
System.out.println(helloEncoded); //hello
```







1. Bare bogstaver om til tal. number cipher
   1. Vi skal lave bogstav om til et tal



## Ceasar cypher



1. Shifter 



## Visionaire cypher

Visionare - kodeord. Shifter den fx "ba" så skifter den det første b 2 bogstaver



## Enigma cypher

1. 

