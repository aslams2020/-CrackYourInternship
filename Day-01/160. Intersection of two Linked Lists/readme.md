# 45 Days Coding Challenge

## Day 1:
## Intersection of Two Linked Lists

### Problem Statement

Given the heads of two singly linked-lists `headA` and `headB`, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return `null`.

### Example

**Input:** intersectVal = 8, listA = [4, 1, 8, 4, 5], listB = [5, 6, 1, 8, 4, 5], skipA = 2, skipB = 3  
**Output:** Intersected at '8'  
**Explanation:** The intersected node's value is 8.

### Solution

The solution involves finding the lengths of both linked lists and adjusting the starting points of both lists so they can be traversed simultaneously. Once aligned, the intersection point can be found by comparing the nodes of both lists.

### Code

```java
// File: IntersectionOfTwoLinkedLists.java

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        
        int len1 = lengthLL(headA);
        int len2 = lengthLL(headB);
        
        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                ptr1 = ptr1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                ptr2 = ptr2.next;
            }
        }
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;  
    }


    private int lengthLL(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
}
```