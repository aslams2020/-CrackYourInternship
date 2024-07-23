# 45 Days Coding Challenge

## Day 1: 
## Merge Two Sorted Lists

### Problem Statement

You are given the heads of two sorted linked lists `list1` and `list2`. Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.

### Example

**Input:** list1 = [1, 2, 4], list2 = [1, 3, 4]  
**Output:** [1, 1, 2, 3, 4, 4]  
**Explanation:** The merged linked list is [1, 1, 2, 3, 4, 4].

**Input:** list1 = [], list2 = []  
**Output:** []  

### Solution

The solution involves iterating through both lists and merging them into a new list in a sorted order. A dummy node is used to simplify the merging process.

### Code

```java
// File: MergeTwoSortedLists.java
// Author: Aslam Sayyad
// Description: Solution for the "Merge Two Sorted Lists" problem from LeetCode.

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val < ptr2.val) {
                current.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                current.next = ptr2;
                ptr2 = ptr2.next;
            }
            current = current.next;
        }

        if (ptr1 != null) {
            current.next = ptr1;
        } else {
            current.next = ptr2;
        }

        return dummy.next;
    }
}
``` 