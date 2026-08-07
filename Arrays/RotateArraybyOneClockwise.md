# Rotate Array by One Position (Right Rotation)

## 📝 Problem Statement
Given an array, rotate it by *one position to the right*.

### Example

*Input:*
text
[1, 2, 3, 4, 5]


*Output:*
text
[5, 1, 2, 3, 4]


---

## 💡 Approach

1. Store the *last element* of the array in a temporary variable.
2. Traverse the array from *right to left*.
3. Shift every element one position to the right.
4. Place the stored last element at the first index.

This performs a right rotation by one position *in-place*.

---

## 🔍 Code Explanation

java
int n = arr.length;

- Stores the size of the array.

java
int temp = arr[n - 1];

- Saves the last element because it will be overwritten during shifting.

java
for (int i = n - 2; i >= 0; i--) {
    arr[i + 1] = arr[i];
}

- Starts from the second last element.
- Shifts each element one position to the right.

java
arr[0] = temp;

- Places the saved last element at the beginning of the array.

---

## ⏱️ Time Complexity

- *O(n)*

---

## 💾 Space Complexity

- *O(1)*

---

## ✅ Summary

- Store the last element.
- Shift all elements one position to the right.
- Place the stored element at index 0.
- Efficient in-place solution with *O(n)* time and *O(1)* extra space.