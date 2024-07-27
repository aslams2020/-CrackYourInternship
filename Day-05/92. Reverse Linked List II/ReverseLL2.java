public class ReverseLL2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++)
            prev = prev.next;

        ListNode curr = prev.next;
        // reversing
        for (int i = 0; i < right - left; i++) {
            ListNode curr2 = curr.next;
            curr.next = curr2.next;
            curr2.next = prev.next;
            prev.next = curr2;
        }
        return dummy.next;
    }
}
