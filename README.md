# math

## Collatz

collatz.py is a Python CLI to test the Collatz Conjecture. From [Wikipedia](https://en.wikipedia.org/wiki/Collatz_conjecture)
"The conjecture can be summarized as follows. Take any positive integer n. If n is even, divide it by 2 to get n / 2. If n is odd, multiply it by 3 and add 1 to obtain 3n + 1. Repeat the process (which has been called "Half Or Triple Plus One", or HOTPO) indefinitely. The conjecture is that no matter what number you start with, you will always eventually reach 1."

```
$ # +> or -> indicates the next number is larger or smaller respectively.
$ python collatz.py 100
100 -> 50 -> 25 +> 76 -> 38 -> 19 +> 58 -> 29 +> 88 -> 44 -> 22 -> 11 +> 34 -> 17 +> 52 -> 26 -> 13 +> 40 -> 20 -> 10 -> 5 +> 16 -> 8 -> 4 -> 2 => 1

$ python collatz.py 100
10 -> 5 +> 16 -> 8 -> 4 -> 2 => 1
```

Relevant XKCD:

![XKCD collatz_conjecture.png](http://imgs.xkcd.com/comics/collatz_conjecture.png)


## Sources

- https://en.wikipedia.org/wiki/List_of_unsolved_problems_in_mathematics
