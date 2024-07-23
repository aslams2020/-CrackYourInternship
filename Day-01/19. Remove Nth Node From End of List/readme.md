# 45 Days Coding Challenge

## Day 2: 
## Remove Nth Node From End of List

### Problem Statement

Given the head of a linked list, remove the nth node from the end of the list and return its head.

### Example

**Input:** head = [1, 2, 3, 4, 5], n = 2  
**Output:** [1, 2, 3, 5]  
**Explanation:** The nth node from the end is 4, so removing it results in [1, 2, 3, 5].

**Input:** head = [1], n = 1  
**Output:** []  
**Explanation:** The nth node from the end is 1, so removing it results in an empty list.

### Solution

The solution involves using two pointers. The fast pointer is moved `n` steps ahead, then both pointers are moved until the fast pointer reaches the end of the list. This ensures the slow pointer is at the node just before the one to be removed.

### Code

```java
// File: RemoveNthNodeFromEndOfList.java
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null || head.next == null) return null;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if (fast == null) return head.next;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
```