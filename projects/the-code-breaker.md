# The code breaker!



Let's talk about codes!

Back in the day, like waaaaay back in the day the Romans had a problem. Getting secret messages from a sender (fx a emporer) to a receiver (an commander) was difficult. If the enemy got hold of the message it could cost lives and even empires to fall. Therefore Julius Ceasar invented a way to encode a message so that other people could not just read the message in cleartext. 

In this homework we will be working with how to decode and how to encode messages. 

https://www.youtube.com/watch?v=Kf9KjCKmDcU



## Number cypher

A number cypher takes a word and converts all charcters to numbers. The numbers are equal to the order of the character in the alphabeat. Here is an example:



Use the methods you created yesterday to solve the following problems!



### Encoder

Create a method called `numberCypherEncoder` that takes a `String` and encodes that `String`

```java
String benEncoded = numberCypherEncoder("ben");
System.out.println(benEncoded); // 2;5;14

String helloEncoded = numberCypherEncoder("hello");
System.out.println(helloEncoded); // 8;5;12;12;15
```



### Decoder

Create a method called `numberCypherDecoder` that takes a `String` and encodes that `String`

```java
String benEncoded = numberCypherEncoder("2;5;14");
System.out.println(benEncoded); // ben

String helloEncoded = numberCypherEncoder("8;5;12;12;15");
System.out.println(helloEncoded); // hello
```



## Ceasar cypher

https://www.youtube.com/watch?v=sMOZf4GN3oc

https://www.youtube.com/watch?v=o6TPx1Co_wg



### Encoder

Create a method called `ceasarEncoder` it takes a `String` and returns a new `String` with the encoded message. Here is an example of the output:

```java
String helloEncodedCeasar = ceasarEncoder("hello");
System.out.println(helloEncodedCeasar); // khoor
```



### Decoder

Create a method called `ceasarDecoder` it takes a `String` and returns a new `String` with the encoded message. Here is an example of the output:

```java
String khoorDecodedCeasar = ceasarDecoder("khoor");
System.out.println(khoorDecodedCeasar); // hello
```



### Test test test

Go [here](https://www.dcode.fr/caesar-cipher) to test if your Ceasar cypher code works



### *Optional*

Change the direction and the number of characters to shift!

Optimize the decoder and encoder functions so the direction and number of characters to shift can be put as arguments to the functions:

```java
String helloEncodedCeasar = ceasarEncoder("hello", "left", 13);
String somewordDecodedCeasar = ceasarDecoder("someword", "left", 13);
```



# Vigenère cipher - Advanced level *optional*

Skriv en decoder og en encoder for Vigenère cipher. Studer selv hvordan Vigenère cipher virker

Her er et eksempel på hvordan man ville bruge den:

```java
String messageToEncode = "hello";
String key = "kea";
String helloEncodedVigenere = vigenereEncoder(messageToEncode, key);
System.out.println(helloEncodedVigenere); // rilvs

String messageToDecode = "rilvs";
String key = "kea";
String rilvsDecodedVigenere = vigenereDecoder(messageToDecode, key);
System.out.println(rilvsDecodedVigenere); // hello
```



Du kan teste om det du har skrevet virker med den her side: https://cryptii.com/pipes/vigenere-cipher



## Enigma cypher - Expert level *optional*

Write an encoder and a decoder for the Enigma cypher. 

