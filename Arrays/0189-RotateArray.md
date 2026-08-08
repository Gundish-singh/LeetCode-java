 Rotate Array by K Positions

## 📝 Problem Statement

Given an array nums and an integer k, rotate the array to the *right by k positions*.

### Example

*Input:*
text
nums = [1, 2, 3, 4, 5, 6, 7]
k = 3


*Output:*
text
[5, 6, 7, 1, 2, 3, 4]


---

## 💡 Approach

The solution uses a temporary array to store the last k elements.

### Steps:

1. Find the length of the array.
2. Use k = k % n to handle cases where k is greater than the array length.
3. Store the last k elements in a temporary array.
4. Shift the remaining elements k positions to the right.
5. Copy the temporary elements to the beginning of the original array.

---


###

- Time Complexity: *O(n)*
- Space Complexity: *O(k)*