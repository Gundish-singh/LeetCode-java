# Remove Duplicates from Sorted Array

## Problem Statement
Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once. Return the number of unique elements.

---

## Approach
- Since the array is already sorted, duplicate elements are always adjacent.
- Use two pointers:
  - `i` points to the last unique element.
  - `j` traverses the array from left to right.
- Whenever `nums[j]` is different from `nums[i]`, place it at `i + 1` and increment `i`.
- After the loop, the first `i + 1` elements contain all unique values.

---

## Algorithm
1. Initialize `i = 0`.
2. Traverse the array using `j` from `1` to `n - 1`.
3. If `nums[i] != nums[j]`:
   - Increment `i`.
   - Copy `nums[j]` to `nums[i]`.
4. Return `i + 1` as the count of unique elements.

---



## Time Complexity
- **O(n)** – The array is traversed only once.

## Space Complexity
- **O(1)** – No extra space is used.

---

## Key Concepts
- Two Pointers
- Array
- In-place Modification
- Sorted Array