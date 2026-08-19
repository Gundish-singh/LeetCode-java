# LeetCode 136 - Single Number

## Problem

Given a non-empty array of integers `nums`, every element appears twice except for one element that appears only once.

Find and return the element that appears only once.

---

## Intuition

We need to find the number whose frequency is exactly `1`.

For every element in the array:

- Take the current element as `num`.
- Traverse the complete array again.
- Count how many times `num` appears.
- If its count is `1`, return that number.

This approach directly checks the frequency of every element.

---

## Approach

This is a **Brute Force Approach**.

- Use an outer loop to select each element.
- Use an inner loop to count how many times that element appears in the array.
- If the count of an element is `1`, return that element.
- If no such element is found, return `0`.

---

## Algorithm

1. Find the length of the array and store it in `n`.
2. Start an outer loop from index `0`.
3. Store the current element in `num`.
4. Initialize `count = 0`.
5. Traverse the complete array using an inner loop.
6. If `nums[j] == num`, increase `count`.
7. After the inner loop:
   - If `count == 1`, return `num`.
8. If no single element is found, return `0`.

---

## Time Complexity

**O(n²)**

## Space Complexity

**O(1)**

