# Largest Element in an Array

## Source
- Striver A2Z DSA Sheet

## Problem

Given an array of integers, find the largest element present in the array.

---

## Intuition

The largest element must be greater than or equal to every other element in the array.

Instead of comparing every element multiple times, we can keep track of the current largest element while traversing the array only once.

---

## Approach

- Initialize a variable largest with the first element of the array.
- Traverse the array from the second element.
- Compare every element with largest.
- If the current element is greater than largest, update it.
- After completing the traversal, largest will contain the maximum element.

---

## Algorithm

1. Set largest = arr[0].
2. Traverse the array from index 1 to n-1.
3. If arr[i] > largest, update largest = arr[i].
4. Continue until the end of the array.
5. Return largest.



## Time Complexity

*O(n)*

Reason:
- The array is traversed only once.

---

## Space Complexity

*O(1)*

Reason:
- Only one extra variable (largest) is used.

---

## Why is this the Optimal Solution?

Every element must be checked at least once to determine the maximum element.

Therefore, no algorithm can solve this problem in less than *O(n)* time.

Hence, this is the optimal solution.

---

## Key Learning

- Learned how to find the maximum element using a single traversal.
- Understood how to maintain a running maximum.
- Learned why this solution is optimal.
- Improved understanding of array traversal.

---

## Tags

- Array
- Traversal
- Linear Scan
- Maximum Element