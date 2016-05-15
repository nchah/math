#!/usr/bin/env python

import argparse


def collatz(n):
    n = int(n)
    stack = ""
    stack += str(n) + " -> "
    while n != 1:
        if n / 2 == 1:
            n = 1
            stack += str(n)
        elif n % 2 == 0:
            n = n / 2
            stack += str(n) + " -> "
        elif n % 2 != 0 and n != 1:
            n = (n * 3) + 1
            stack += str(n) + " -> "
    print stack


if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('n', help='number to test collatz conjecture')
    args = parser.parse_args()
    collatz(args.n)

