
public class RemoveNthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head;
            ListNode fast = head;
    
            if(head==null || head.next==null) return null;
            
            for(int i=1; i<=n; i++) {
                fast = fast.next;
            }
            if(fast == null) return head.next;
            while(fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            
            slow.next = slow.next.next;
    
            return head;
        }
}
