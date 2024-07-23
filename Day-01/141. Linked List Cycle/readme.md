# 45 Days Coding Challenge

## Day 1: 
## Linked List Cycle

### Problem Statement

Given `head`, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, `pos` is used to denote the index of the node that the tail's next pointer is connected to. Note that `pos` is not passed as a parameter.

Return `true` if there is a cycle in the linked list. Otherwise, return `false`.

### Example

**Input:** head = [3, 2, 0, -4], pos = 1  
**Output:** true  
**Explanation:** There is a cycle in the linked list, where the tail connects to the second node.

### Solution

The solution uses two pointers, `slow` and `fast`. The `fast` pointer moves twice as fast as the `slow` pointer. If there is a cycle, the `slow` and `fast` pointers will eventually meet.

### Code

```java
// File: LinkedListCycle.java
// Author: Aslam Sayyad
// Description: Solution for the "Linked List Cycle" problem from LeetCode.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        // No cycle detected
        return false;
    }
}
``` 

### Time and Space Analysis- 
1. **Time Complexity :** O(N) 
2. **Space Complexity :** O(1) 