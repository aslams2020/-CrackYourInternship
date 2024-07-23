# 45 Days Coding Challenge

## Day 1:
## Middle of the Linked List

### Problem Statement

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

### Example

**Input:** head = [1, 2, 3, 4, 5]  
**Output:** [3, 4, 5]  
**Explanation:** The middle node of the list is node 3.

### Solution

The solution uses two pointers, `slow` and `fast`. The `fast` pointer moves twice as fast as the `slow` pointer. When the `fast` pointer reaches the end of the list, the `slow` pointer will be at the middle.

### Code

```java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        // Initialize two pointers, slow and fast
        ListNode slow = head;
        ListNode fast = head;

        // Move fast pointer twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Slow pointer is now at the middle of the list
        return slow;
    }
}
```

### Time and Space Complexity
1. **Time Complexity :** O(N) where n is the length of the linked list.
1. **Space Complexity :** O(1) since only a constant amount of extra space is used.