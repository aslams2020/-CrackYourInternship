# 45 Days Coding Challenge

## Day 2:
## Remove Duplicates from Sorted Array

### Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

### Example

**Input:** nums = [1, 1, 2]  
**Output:** 2, nums = [1, 2, _]  
**Explanation:** The function should return the new length, 2, and the first two elements of `nums` should be 1 and 2, respectively. It doesn't matter what you leave beyond the new length.

**Input:** nums = [0,0,1,1,1,2,2,3,3,4]  
**Output:** 5, nums = [0,1,2,3,4,_,_,_,_,_]  
**Explanation:** The function should return the new length, 5, and the first five elements of `nums` should be 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.

### Solution

The solution involves using two pointers: one to iterate through the array and the other to track the position of the unique elements.

### Code

```java
// File: RemoveDuplicatesSortedArray.java


class removeDupliSorted {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniquePtr = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePtr]) {
                uniquePtr++;
                nums[uniquePtr] = nums[i];
            }
        }

        return uniquePtr + 1;
    }
}
```
