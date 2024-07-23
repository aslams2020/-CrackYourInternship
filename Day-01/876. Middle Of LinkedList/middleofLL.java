import java.util.*;

class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode middleNode(ListNode head) {
        // means, we have to find right mid : fast.
        ListNode slow = head;
        ListNode fast = head;

        // fast will be 2X speeder than slow always
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
}