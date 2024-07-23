public class PalindromeLL {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        public boolean isPalindrome(ListNode head) {
            // efficient inplace approach : 
            //1. middle ele
            ListNode slow = head;
            ListNode fast = head;
            if(head.next == null)
                return true;
            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // reverse the LL after middle ele (slow yhin hai) 
            ListNode revHead = reverse(slow.next);
            slow.next = revHead;
            ListNode ptr1 = head;
            ListNode ptr2 = slow.next;
    
            while(ptr2 != null) {
                if(ptr1.val != ptr2.val) 
                    return false;
    
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
    
            return true;
    
        }
    
        static ListNode reverse(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode curr2 = null;
    
            while(curr != null) {
                curr2 = curr.next;
                curr.next = prev;
                prev = curr;
                curr = curr2;
            }
            return prev;
        }
}
