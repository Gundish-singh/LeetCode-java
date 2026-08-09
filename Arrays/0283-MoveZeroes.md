# LeetCode 283 - Move Zeroes

## Problem

Given an integer array `nums`, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The modification should be done in-place.

## Approach

- Create an `ArrayList` named `temp` to store all non-zero elements.
- Traverse the array and add every non-zero element to `temp`.
- Copy the elements of `temp` back into the original array.
- Fill the remaining positions of the array with `0`.

## Algorithm

1. Find the length of the array.
2. Create an `ArrayList<Integer>` to store non-zero elements.
3. Traverse the array:
   - If `nums[i] != 0`, add `nums[i]` to `temp`.
4. Copy all elements from `temp` back to `nums`.
5. From `temp.size()` to `n-1`, fill the array with `0`.


## Explanation

The first loop removes the zero elements logically by storing only non-zero elements in `temp`.

The second loop places these non-zero elements at the beginning of the original array.

The third loop fills all remaining positions with `0`.

Therefore, all zeroes are moved to the end while the order of non-zero elements remains unchanged.

## Time Complexity

O(n)

The array is traversed a constant number of times.

## Space Complexity

O(n)

An `ArrayList` is used to store the non-zero elements.

## Tags

- Array
- ArrayList
- Brute Force