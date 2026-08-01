# Check if Array is Sorted

## Problem Statement

Given an `ArrayList<Integer> nums`, determine whether the array is sorted in **non-decreasing order**.

Return:

- `true` if the array is sorted.
- `false` otherwise.

---

## Example

### Input
```java
nums = [1, 2, 3, 4, 5]
```

### Output
```java
true
```

### Input
```java
nums = [1, 3, 2, 4, 5]
```

### Output
```java
false
```

---

## Approach (Optimal)

1. Traverse the array from the first element to the second last element.
2. Compare the current element with the next element.
3. If the current element is greater than the next element, the array is not sorted.
4. Return `false` immediately.
5. If no such pair is found, return `true`.

---

## Time Complexity

- **O(n)**

The array is traversed only once.

---

## Space Complexity

- **O(1)**

No extra space is used.

---

## Key Learning

- Learn how to traverse an `ArrayList`.
- Compare adjacent elements to verify sorted order.
- Use **early return** to optimize the solution.
- This is the **optimal approach** since every element is checked at most once.