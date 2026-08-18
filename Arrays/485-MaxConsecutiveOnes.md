# LeetCode 485 - Max Consecutive Ones

## Problem

Given a binary array `nums`, find the maximum number of consecutive `1`s in the array.

Return the maximum count of consecutive `1`s.

## Approach

- Traverse the array from left to right.
- If the current element is `1`, increase `count`.
- If `count` becomes greater than `maxcount`, increase `maxcount`.
- If the current element is `0`, reset `count` to `0`.
- Finally, return `maxcount`.

## Algorithm

1. Find the length of the array and store it in `n`.
2. Initialize `count = 0`.
3. Initialize `maxcount = 0`.
4. Traverse the array using a `for` loop.
5. If `nums[i] == 1`:
   - Increase `count`.
   - If `count > maxcount`, increase `maxcount`.
6. If `nums[i] == 0`, reset `count = 0`.
7. Return `maxcount`.

 # Time Complexity: O(n)
 # Space Complexity: O(1)