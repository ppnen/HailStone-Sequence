# HailStone-Sequence

Definition of Hailstone sequence:
For every natural number n > 1 the so-called Hailstone sequence is calculated as the following. If x is the last calculated element, the next element is:
x / 2, if x is even
3x + 1, if x is odd
When the sequence reaches number 1, it stops. For example, if n = 12, the sequence is 12, 6, 3, 10, 5, 16, 8, 4, 2, 1.
Collatz conjecture claims that for every starting number n the sequence will stop eventually. While it is an open problem if this conjecture holds, it was verified for all n < 2 60 .

CODE:
My code aims takes an initial/random number from which it calculates the hailstone sequence.
Then it calculates the number of steps taken to reach .
Also tells the second largest number in the sequence.

Code output is an html file with that same information.

For example, for 27 as an input, the number of steps is 111 and the second largest number reached is 7288. 

