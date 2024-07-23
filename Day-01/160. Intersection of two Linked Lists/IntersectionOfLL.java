
public class IntersectionOfLL {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }

    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        ListNode ptr1 = head1;
        ListNode ptr2 = head2;
        //find lengths of both linkedlist;
            int n1 = lengthLL(head1);
            int n2 = lengthLL(head2);
            if(n1 > n2) {
                for(int i = 1; i<= n1-n2; i++) 
                    ptr1 = ptr1.next;
            } else{
                for(int i = 1; i<= n2-n1; i++) 
                    ptr2 = ptr2.next;
            }

            while(ptr1!= ptr2) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }

        return ptr1;
        }

    static int lengthLL(ListNode head) {
        int length = 0;
        ListNode ptr = head;
        while( ptr !=null ){
            length++;
            ptr = ptr.next;
        }
    return length;
    }
}