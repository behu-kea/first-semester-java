# Tamagotchi 😸🐶

https://www.youtube.com/watch?v=tJE-5nIOXKI

We will today be creating a tamagotchi. A tamagotchi is a virtual pet that you can interact with. It was quite a big deal back when i was young. Not so much anymore. 

A tamagotchi had to be kept alive. You could feed it, play with it, dress it etc. 



![T](https://assets.partyking.org/img/products/1300/tamagotchi-original-1.jpg)



## Tamagotchi details

We have to create 4 different classes

1. `Game` - Class that initiates a game and takes user input
2. `Tamagotchi` - Super class for  `Cat` and `Dog`
3. `Cat` - A class that inherits from `Tamagotchi`
4. `Dog` - A class that also inherits from `Tamagotchi`



### `Game` class

This class can be seen as the "main" class. It takes data from a user and now creates either a `Cat` object or a `Dog` object. 



### `Tamagotchi` class

Is the super class for `Cat` and `Dog`. It contains the more general characteristics of `Cat` and `Dog`

It **could** have some of the following attributes

- `name`
- `age`
- `mood`
- `energy`
- .



And it **could** have some of the following methods. But its up to you!

- `play()`
- `feed()`
- `sleep(6)`
- ...



### `Cat` and `Dog`

The `Cat` and `Dog` should extend `Tamagotchi`!

You come up with what attributes and methods relevant for a `Cat` and a `Dog`

Fx a `Dog` could maybe `bark()`. It's up to you

One requirement is that both `Cat` and `Dog` should at some point `override` a method from `Tamagotchi`!



## Requirements

- `Game` class
- `Tamagotchi` class
- `Cat` and `Dog` classes that extends `Tamagotchi`
- In the `Cat` and `Dog` classes there should be at least one override method
- Draw a class diagram of all your classes and create a sequence diagram of one specific use case



## Your task

A user should be able to create either a `Cat` or a `Dog` with a name. That pet will then be created with random values. 

Your task is now to create a Tamagotchi that is fun to play with using the above requirements! Create a new game object using the `Game` class that can spawn a `cat`, a `dog` or both



## Example

```
Hello, would you like to create a dog or a cat? Press 1 for dog and 2 for cat
1

Ahh you would like to create a cat, what should the name of the cat be?
Miaui McLickALot

Okay, here is your cat Miaui McLickALot
 /\_/\
( o.o )
 > ^ <
What would you now like to do?
1 - play
2 - feed
3 - sleep
1

Miaui McLickALot is running after a ball, now her energy went down 1 and her hunger went up 1
What would you now like to do?
1 - play
2 - feed
3 - sleep
3

      |\      _,,,---,,_
ZZZzz /,`.-'`'    -.  ;-;;,_
     |,4-  ) )-,_. ,\ (  `'-'
    '---''(_/--'  `-'\_)  
Miaui McLickALot now has full energy!
What would you now like to do?
1 - play
2 - feed
3 - sleep
```

This is just an example please come up with your own virtual pet 😸



## Optional tasks

- Make the pet objects interact with each other
- Create more pets than just `Cat` and `Dog`
- Make it possible for time to pass in the game! Fx if a pet has not gotten food in some time it becomes hungry. You could fx do that by in the `Game` class creating a `tick` method that simulates that time has elapsed. This `tick` method can then be called each second that then affects the pets stats
- Your idea here!



## Handin

Hand in on fronter here: https://kea-fronter.itslearning.com/LearningToolElement/ViewLearningToolElement.aspx?LearningToolElementId=927870

Hand in via git!



## Handin checklist

- Have you tested that the code works?
- Have you written comments to the code?
- Have you thought of a good structure?
- Is the code easy to understand and read?
- Does the variablename make sense?
