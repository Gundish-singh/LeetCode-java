# Second Largest Element in an Array

## Source
- Striver A2Z DSA Sheet

## Problem

Given an array of integers, find the second largest element in the array.
If the second largest element does not exist, return -1.

---

## Intuition

The second largest element is the largest value that is smaller than the maximum element.

Instead of sorting the array, we can keep track of both the largest and the second largest elements while traversing the array only once.

---

## Approach

- Initialize two variables:
  - largest = Integer.MIN_VALUE
  - secondLargest = Integer.MIN_VALUE
- Traverse the array.
- If the current element is greater than largest:
  - Update secondLargest = largest
  - Update largest = current element
- Else if the current element is greater than secondLargest and not equal to largest:
  - Update secondLargest.
- After completing the traversal:
  - If secondLargest is still Integer.MIN_VALUE, return -1.
  - Otherwise, return secondLargest.

---

## Algorithm

1. Initialize largest and secondLargest with Integer.MIN_VALUE.
2. Traverse the array.
3. If the current element is greater than largest:
   - Update secondLargest = largest
   - Update largest = current element
4. Otherwise, if the current element is greater than secondLargest and not equal to largest, update secondLargest.
5. Return secondLargest (or -1 if it does not exist).



## Time Complexity

*O(n)*

Reason:
- The array is traversed only once.

---

## Space Complexity

*O(1)*

Reason:
- Only two extra variables are used.

---

## Why is this the Optimal Solution?

Sorting the array would take *O(n log n)* time.

Since we only need the second largest element, sorting is unnecessary.

By maintaining the largest and second largest values during a single traversal, we achieve *O(n)* time complexity, which is optimal.

---

## Key Learning

- Learned how to maintain two maximum values simultaneously.
- Understood how to avoid sorting when only the second largest element is required.
- Improved understanding of single-pass traversal.
- Learned how to handle duplicate maximum elements correctly.

---

## Example

### Input

text
arr = [8, 2, 5, 7, 1]


### Output

text
7


### Explanation

- Largest element = *8*
- Second largest element = *7*

---

## Tags

- Array
- Traversal
- Second Largest Element
- Single Pass
- Optimal Solution