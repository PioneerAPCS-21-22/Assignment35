# Assignment 35

The bean machine, also known as a quincunx or the Galton box, is a device for statistics experiments named after English scientist Sir Francis Galton. It consists of an upright board with evenly spaced nails (or pegs) in a triangular form, as shown below.

![alt text](http://i.imgur.com/FXY6XHr.png "Bean Machine")

Balls are dropped from the opening of the board. Every time a ball hits a nail, it has a 50% chance of falling to the left or to the right. The piles of balls are accumulated in the slots at the bottom of the board.

## Specifications

Write a program that simulates the bean machine. **Your program should prompt the user to enter the number of the balls and the number of the slots in the machine. Your program must use both a Main class and a Machine class.**

I would recommend a constructor that takes the number of slots and balls as parameters, a method that simulates the balls dropping through the machine, a method that prints the paths of the balls, and a method that prints the diagram.

Simulate the falling of each ball by printing its path. For example, the path for the ball in (b) is LLRRLLR and the path for the ball in (c) is RLRRLRR. Display the final buildup of the balls in the slots in a histogram (similar to what it looks like in the diagram above).

### Sample Outputs

```
Enter the number of balls to drop: 5
Enter the number of slots in the bean machine: 8

LRLRLRR
RRLLLRR
LLRLLRR
RRLLLLL
LRLRRLR

        O
        O
_ _ O O O _ _ _
```

```
Enter the number of slots for the machine: 4
Enter the number of balls: 25
LRR
LLR
RRR
RRR
LRR
LLR
RRR
RLR
LLR
RLL
LLR
RRL
LRR
RRL
RLL
RLR
LLL
RRR
LLR
LLR
RRR
LRR
LLL
RRR
LRR

    O
  O O
  O O
  O O O
  O O O
  O O O
  O O O
O O O O
O O O O
```

### Grading

As always, your program will be graded on its functionality according to the project specifications and proper code style. Please include comments for all methods to enhance readability.
