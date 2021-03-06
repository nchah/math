# math

## Contents

```
$ tree
.
├── README.md
└── collatz
    ├── Collatz.class
    ├── Collatz.java
    ├── Collatz.scala
    ├── Collatz2.class
    ├── Collatz2.java
    └── collatz.py
```

## Collatz

From [Wikipedia](https://en.wikipedia.org/wiki/Collatz_conjecture), the Collatz conjecture can be expressed as follows:
```
"Take any positive integer n. 
If n is even, divide it by 2 to get n / 2. 
If n is odd, multiply it by 3 and add 1 to obtain 3n + 1. 
Repeat the process (which has been called "Half Or Triple Plus One", or HOTPO) indefinitely. 
The conjecture is that no matter what number you start with, you will always eventually reach 1."
```

`collatz.py` is a Python command-line tool to test the Collatz Conjecture.

```
$ # +> or -> indicates the next number is larger or smaller than the initial number respectively.
$ python collatz.py 100
100 -> 50 -> 25 +> 76 -> 38 -> 19 +> 58 -> 29 +> 88 -> 44 -> 22 -> 11 +> 34 -> 17 +> 52 -> 26 -> 13 +> 40 -> 20 -> 10 -> 5 +> 16 -> 8 -> 4 -> 2 => 1 (25 ops)

$ python collatz.py 10
10 -> 5 +> 16 -> 8 -> 4 -> 2 => 1 (6 ops)
```

`Collatz.java` and `Collatz2.java` are equivalent Java programs.

```
$ javac Collatz.java
$ javac Collatz2.java


$ java Collatz
Enter number to test Collatz Conjecture: 
100
100.0  -> 50.0 -> 25.0 +> 76.0 -> 38.0 -> 19.0 +> 58.0 -> 29.0 +> 88.0 -> 44.0 -> 22.0 -> 11.0 +> 34.0 -> 17.0 +> 52.0 -> 26.0 -> 13.0 +> 40.0 -> 20.0 -> 10.0 -> 5.0 +> 16.0 -> 8.0 -> 4.0 -> 2.0 => 1 (25.0 ops)

$ java Collatz2 100
100.0  -> 50.0 -> 25.0 +> 76.0 -> 38.0 -> 19.0 +> 58.0 -> 29.0 +> 88.0 -> 44.0 -> 22.0 -> 11.0 +> 34.0 -> 17.0 +> 52.0 -> 26.0 -> 13.0 +> 40.0 -> 20.0 -> 10.0 -> 5.0 +> 16.0 -> 8.0 -> 4.0 -> 2.0 => 1 (25.0 ops)


$ java Collatz
Enter number to test Collatz Conjecture: 
10
10.0  -> 5.0 +> 16.0 -> 8.0 -> 4.0 -> 2.0 => 1 (6.0 ops)

$ java Collatz2 10
10.0  -> 5.0 +> 16.0 -> 8.0 -> 4.0 -> 2.0 => 1 (6.0 ops)
```

Relevant XKCD:

![XKCD collatz_conjecture.png](http://imgs.xkcd.com/comics/collatz_conjecture.png)


## Sources

- https://en.wikipedia.org/wiki/List_of_unsolved_problems_in_mathematics

