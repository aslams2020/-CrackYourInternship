# 45 Days Coding Challenge

## Day 2: 
## Majority Element

### Problem Statement

Given an array `nums` of size `n`, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

### Example

**Input:** nums = [3,2,3]  
**Output:** 3

**Input:** nums = [2,2,1,1,1,2,2]  
**Output:** 2

### Constraints

- `n == nums.length`
- `1 <= n <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

### Solution

The solution involves using a HashMap to count the occurrences of each element in the array. The element with a count greater than `n / 2` is the majority element.

### Code

```java
// File: MajorityElement.java

import java.util.*;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        for (var entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}
```