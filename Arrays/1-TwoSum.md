# LeetCode 1 - Two Sum

## Problem
Given an array of integers and a target, return the indices of the two numbers whose sum equals the target.

## Approach
- Use two nested loops.
- Check every pair of elements.
- If their sum equals the target, return the indices.

## Algorithm
1. Traverse the array using the first loop.
2. Use the second loop to check the remaining elements.
3. If nums[i] + nums[j] == target, return {i, j}.

## Time Complexity
O(n²)

## Space Complexity
O(1)

## Example

Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9
Therefore, return [0,1].

## Tags
- Array
- Brute Force