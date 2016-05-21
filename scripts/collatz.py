#!/usr/bin/env python
"""
collatz.py
- CLI tool that prints out the collatz conjecture (3n + 1) numbers for an input.
- +> and -> show that the next number is larger or smaller than the one before.

"""

import argparse


def collatz(n):
    n = int(n)
    stack_count = 0
    stack = ""
    stack += str(n)
    while n != 1:
        if n / 2.0 == 1:
            n = 1
            stack += " => " + str(n)
            stack_count += 1
        elif n % 2 == 0:
            n = n / 2
            stack += " -> " + str(n)
            stack_count += 1
        elif n % 2 != 0 and n != 1:
            n = (n * 3) + 1
            stack += " +> " + str(n)
            stack_count += 1
    print stack + " (" + str(stack_count) + " ops)"


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('n', help='number to test collatz conjecture')
    args = parser.parse_args()
    collatz(args.n)

