# 45 Days Coding Challenge

## Day 1: Two Sum

### Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

### Example

**Input:** nums = [2, 7, 11, 15], target = 9  
**Output:** [0, 1]  
**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1].

### Solution

The solution uses a hashmap to store the difference between the target and the current element as we iterate through the array. If the difference is found in the hashmap, it means we have found the two indices that add up to the target.

### Code

```java
// File: TwoSum.java
// Description: Solution for the "Two Sum" problem from LeetCode.

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            
            int diff = target - nums[i];

            if (mp.containsKey(diff)) {
                return new int[] { mp.get(diff), i };
            }

            mp.put(nums[i], i);
        }

        return new int[] {};
    }
}

```
### Time and Space Complexities
1. **Time Complexity** : O(n)
2. **Space Complexity** : O(n) due to the use of the hashmap.