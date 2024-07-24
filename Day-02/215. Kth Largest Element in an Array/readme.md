# 45 Days Coding Challenge

## Day 2: Kth Largest Element in an Array

### Problem Statement

Given an integer array `nums` and an integer `k`, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

### Example

**Example 1:**

**Input:** nums = [3,2,1,5,6,4], k = 2  
**Output:** 5

**Example 2:**

**Input:** nums = [3,2,3,1,2,4,5,5,6], k = 4  
**Output:** 4

### Constraints

- `1 <= k <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

### Solution

The solution involves using a min-heap to efficiently find the kth largest element in the array. By maintaining a heap of size k, the top of the heap will always be the kth largest element after processing all elements.

### Code

```java
// File: Solution.java
// Author: Aslam Sayyad
// Description: Solution for the "Kth Largest Element in an Array" problem from LeetCode.

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = nums.length;

        // Add elements into min-heap
        for (int i = 0; i < n; i++) {
            q.add(nums[i]);
            if (q.size() > k) {
                q.poll();
            }
        }

        // Remaining top element in heap is the answer
        return q.peek();
    }
}
