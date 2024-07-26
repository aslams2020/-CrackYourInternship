# 45 Days Coding Challenge

## Day 4:
## Find the Index of the First Occurrence in a String

### Problem Statement

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`, or -1 if `needle` is not part of `haystack`.

### Example

**Example 1:**

**Input:** haystack = "sadbutsad", needle = "sad"  
**Output:** 0  
**Explanation:** "sad" occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.

**Example 2:**

**Input:** haystack = "leetcode", needle = "leeto"  
**Output:** -1  
**Explanation:** "leeto" did not occur in "leetcode", so we return -1.

### Constraints

- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only lowercase English characters.

### Solution

To solve this problem, we use a simple string matching algorithm. The approach involves checking each possible starting position in `haystack` and comparing the substring of `haystack` with `needle`.

### Code

```java
// File: Solution.java
// Author: Aslam Sayyad
// Description: Solution for the "Implement strStr()" problem.

public class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        if (n1 < n2)
            return -1;
        
        for (int i = 0; i <= n1 - n2; i++) {
            int j = 0;
            while (j < n2 && haystack.charAt(i + j) == needle.charAt(j))
                j++;
            if (j == n2) {
                return i;
            }
        }
        
        return -1;
    }
}
