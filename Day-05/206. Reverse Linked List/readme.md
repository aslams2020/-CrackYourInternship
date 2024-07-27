# 45 Days Coding Challenge

## Day 5: Reverse a Linked List

### Problem Statement

Given the head of a singly linked list, reverse the list, and return the reversed list.

### Example

**Example 1:**

**Input:** head = [1,2,3,4,5]  
**Output:** [5,4,3,2,1]

**Example 2:**

**Input:** head = [1,2]  
**Output:** [2,1]

**Example 3:**

**Input:** head = []  
**Output:** []

### Constraints

- The number of nodes in the list is in the range `[0, 5000]`.
- `-5000 <= Node.val <= 5000`

### Solution

To solve this problem, we can use an iterative approach to reverse the linked list. The approach involves using three pointers: `curr` to track the current node, `prev` to track the previous node, and `next` to temporarily store the next node. This allows us to reverse the links between nodes as we traverse the list.

### Code

```java
// File: Solution.java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode curr2 = null;
        ListNode prev = null;

        while (curr != null) {
            curr2 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr2;
        }
        return prev;
    }
}
