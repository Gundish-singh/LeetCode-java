# Linear Search

## Problem

Given an array `nums` and a target value, find the index of the target element.

If the target is present, return its index.

If the target is not present, return `-1`.

## Approach

- Traverse the array from left to right.
- Compare each element with the target.
- If `nums[i] == target`, return the current index.
- If the target is not found, return `-1`.

## Algorithm

1. Find the length of the array.
2. Start the loop from index `0`.
3. Compare `nums[i]` with `target`.
4. If `nums[i] == target`, return `i`.
5. If the loop completes without finding the target, return `-1`.

