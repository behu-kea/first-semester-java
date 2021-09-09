# Crypto converter!

We are joining the crypto train, choo choo everybody aboard 🚂☁️☁️☁️☁️

Let's make a Java program that works like this👇

Firstly it will ask for the firstname and then lastname. Then it will greet the user with a welcoming message! Now the user can write how many dollars the user wants to convert into crypto. Finally the program will output how many crypto coins the user can get with different currencies. Here is an example of the output 👇

```
What is your firstname?
```

Now the user puts in his/her firstname. In this example `Benjamin`

```
What is your surname?
```

Now the user puts in his/her surname. In this example `Hughes`

```
Welcom dear Benjamin Hughes ❤️
Here is a random character in your fullname: g
Anyways we hope you're ready to convert some dollars
How many dollars can you convert today?
```

Now the user writes how many dollars he/she has. In this case 34 dollars

```
Wauv 34 dollars thats a lot 💵
Here is what you can get with 34 dollars
- 0.000234 bitcoin
- 0.1334 dogecoin
- 2.423 scamcoins
In total that is 2.556634 coins in total and the average is 2.4132!
```

This line: `Here is a random character in your fullname: g` should take a random character in the fullname and show it. This will require some googling since you have not learned this!! Think about what you can Google

This line `In total that is 2.556634 coins in total and the average is 2.4132!` should add all the cryptocoins together and also find their average (even though that does not really make any sense 😂)

\*\* I have no idea if those are the correct conversions



## Optional task 1 - custom message

You have not learned how to do this yet so dont stress if you do not know how to

If the user

- Puts in from 0-10 dollars we should print `7 dollars why not more?`
- Puts in from 10-40 dollars we should print `34 dollars, well done`
- Puts in from 40-100 dollars we should print `Wauv 97 dollars thats a lot 💵`



## Optional task 2 - User input validation

Imagine if the user as the price writes the string `"Hello"`. This is not valid input because a price should be a number. The same goes with the name. Imagine that the user writes `10002` as the name or maybe `bahjds%&//&%&/` as the name, this is again not valid input. 

The last thing that we should check for is the currencies. What if the user writes a currency that you dont have the conversion for. This we also need to check for. 

There write some code that fixes this problem! If the user writes some invalid input, inform the user that the iinput was invalid and prompt the user for a new input.

Here is an example:

```
How many dollars can you convert today?
trolololo
trolololo is not a valid price, please input a number:
123
Wauv 123 dollars thats a lot 💵
...
```



## Optional task 3 - User selects currency to convert

Instead of the user converting only dollars to a specific crypto currency the user should be able to specify what currency he currently has and what currency he would like to convert into:

Here is an example

```
What is your firstname?
Benjamin
What is your surname?
Hughes
Welcom dear Benjamin Hughes ❤️
Here is a random character in your fullname: g
Anyways we hope you're ready to convert some money
What amount would you like to convert?
1000
From what currency?
dollars
To what cryptocurrency?
bitcoin
You can get 0,02094000 bitcoins for 1000 dollars
```

*consider if the user has 1 dollar, then we need to update the text, so it does not say dollars but dollar! The same with bitcoins*



## Handing it in

Hand this assignment in on Fronter