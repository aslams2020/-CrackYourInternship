# 45 Days Coding Challenge

## Day 3: Move Zeroes

### Problem Statement

Given an integer array `nums`, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

### Example

**Example 1:**

**Input:** nums = [0, 1, 0, 3, 12]  
**Output:** [1, 3, 12, 0, 0]

**Example 2:**

**Input:** nums = [0]  
**Output:** [0]

### Constraints

- `1 <= nums.length <= 10^4`
- `-2^31 <= nums[i] <= 2^31 - 1`




### Code

```java
// File: Solution.java

public class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0; // stores the index of the next non-zero element

        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
    }
}
