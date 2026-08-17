# LeetCode 268 - Missing Number

## Problem

Given an array `nums` containing `n` distinct numbers taken from the range `[0, n]`, find the only number that is missing from the array.

## Approach

We use the mathematical formula for the sum of the first `n` natural numbers:

`Sum = n * (n + 1) / 2`

- First, calculate the expected sum of numbers from `0` to `n`.
- Then, calculate the actual sum of all elements present in the array.
- Subtract the actual sum from the expected sum.
- The difference is the missing number.

## Algorithm

1. Find the length of the array and store it in `n`.
2. Initialize `Asum = 0`.
3. Traverse the array and calculate the sum of all elements.
4. Calculate the expected sum using:
   `n * (n + 1) / 2`
5. Subtract the actual sum from the expected sum.
6. Return the result as the missing number.

## Dry Run

### Input

```text
nums = [3, 0, 1]