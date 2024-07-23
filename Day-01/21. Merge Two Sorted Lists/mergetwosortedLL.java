
public class mergetwosortedLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null) return null;
        if(list1 == null && list2 !=null) return list2;
        if(list2 != null && list2 ==null) return list1;
        ListNode dummy = new ListNode(-1);
        ListNode ptr1 = list1; 
        ListNode ptr2 = list2;
        ListNode temp = dummy;

        while(ptr1!=null && ptr2!=null) {
            if(ptr1.val < ptr2.val) {
                temp.next = ptr1;
                temp = ptr1;
                ptr1 = ptr1.next;
            }
            else {
                temp.next = ptr2;
                temp = ptr2;
                ptr2 = ptr2.next;
            }
        }
        if(ptr1 == null) {
            temp.next = ptr2;
        }else {
            temp.next = ptr1;
        }

        return dummy.next;
        
    }
}
