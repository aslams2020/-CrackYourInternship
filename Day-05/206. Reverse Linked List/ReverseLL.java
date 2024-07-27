public class ReverseLL {
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
