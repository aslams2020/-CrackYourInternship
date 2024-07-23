# 45 Days Coding Challenge

## Day 2: 
## Palindrome Linked List

### Problem Statement

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

### Example

**Input:** head = [1, 2, 2, 1]  
**Output:** true  
**Explanation:** The list reads the same forward and backward.

**Input:** head = [1, 2]  
**Output:** false  
**Explanation:** The list does not read the same forward and backward.

### Solution

The solution involves finding the middle of the linked list, reversing the second half of the list, and then comparing the first half with the reversed second half.

### Code

```java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
    
        if (head.next == null) return true;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode revHead = reverse(slow.next);
        slow.next = revHead;
        
        ListNode ptr1 = head;
        ListNode ptr2 = slow.next;
        
        while (ptr2 != null) {
            if (ptr1.val != ptr2.val) return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        return true;
    }

    static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
```