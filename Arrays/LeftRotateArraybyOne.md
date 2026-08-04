# Rotate Array by One (Left Rotation)

## Problem Statement
Given an integer array `nums`, rotate the array to the **left by one position**.

### Example
**Input:**
```text
nums = [1, 2, 3, 4, 5]
```

**Output:**
```text
[2, 3, 4, 5, 1]
```

---

## Approach
1. Store the first element in a temporary variable.
2. Shift every element one position to the left.
3. Place the stored first element at the last index.

This performs a **left rotation by one** without using any extra array.

---


## Time Complexity
- **O(n)** — Each element is shifted exactly once.

## Space Complexity
- **O(1)** — Uses only one extra variable.

---

## Key Learning
- Save the first element before shifting.
- Shift all elements one position to the left.
- Place the saved element at the end.
- This is an **in-place left rotation by one** with constant extra space.

---

## Summary
An efficient in-place solution to rotate an array left by one position by storing the first element, shifting the remaining elements left, and placing the stored element at the end.