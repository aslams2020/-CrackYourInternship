# 45 Days Coding Challenge

## Day 4:
## Valid Parentheses

### Problem Statement

Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every closing bracket has a corresponding opening bracket of the same type.

### Example

**Example 1:**

**Input:** s = "()"  
**Output:** true

**Example 2:**

**Input:** s = "()[]{}"  
**Output:** true

**Example 3:**

**Input:** s = "(]"  
**Output:** false

### Constraints

- The length of the string `s` is in the range [0, 10^4].

### Solution

The solution involves using a stack to keep track of the opening brackets. Each time a closing bracket is encountered, it is matched with the top of the stack. If they match, the top of the stack is popped. If they do not match or if the stack is empty when a closing bracket is encountered, the string is invalid. Finally, if the stack is empty after processing the entire string, it means all brackets are properly closed and matched.

### Code

```java
// File: Solution.java
// Author: Aslam Sayyad
// Description: Solution for the "Valid Parentheses" problem from LeetCode.

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
