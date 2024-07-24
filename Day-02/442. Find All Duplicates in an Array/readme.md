# 45 Days Coding Challenge

## Day 2: Find All Duplicates in an Array

### Problem Statement

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appear twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

### Example

**Input:** nums = [4,3,2,7,8,2,3,1]  
**Output:** [2,3]

**Input:** nums = [1,1,2]  
**Output:** [1]

**Input:** nums = [1]  
**Output:** []

### Solution

The solution involves iterating through the array and marking visited numbers by negating the value at the index corresponding to the current number. If a number is already negated, it indicates that the number is a duplicate.

### Code

```java
// File: FindAllDuplicates.java

import java.util.*;

public class FindAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                ans.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return ans;
    }
}
```