# Reverse Linked List II

## Problem Statement

Given the head of a singly linked list and two integers `left` and `right` where `left <= right`, reverse the nodes of the list from position `left` to position `right`, and return the reversed list.

### Example

**Example 1:**

**Input:** head = [1,2,3,4,5], left = 2, right = 4  
**Output:** [1,4,3,2,5]

**Example 2:**

**Input:** head = [5], left = 1, right = 1  
**Output:** [5]

### Constraints

- The number of nodes in the list is `n`.
- `1 <= n <= 500`
- `-500 <= Node.val <= 500`
- `1 <= left <= right <= n`

## Solution

To solve this problem, we use a dummy node to handle edge cases more easily. We then traverse the list to find the node just before the `left` position and perform an in-place reversal of the nodes from `left` to `right`. 

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Step 1: Initialize the dummy node and the previous pointer
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode prev = dummy; 
        
        // Step 2: Move the prev pointer to the node just before the 'left' position
        for(int i = 0; i < left - 1; i++)
            prev = prev.next; 
        
        // Step 3: Initialize the curr pointer to the node at the 'left' position
        ListNode curr = prev.next; 
        
        // Step 4: Reverse the nodes from 'left' to 'right'
        for(int i = 0; i < right - left; i++) {
            ListNode curr2 = curr.next; 
            curr.next = curr2.next;
            curr2.next = prev.next;
            prev.next = curr2;
        }
        
        // Step 5: Return the new head of the list
        return dummy.next;
    }
}
