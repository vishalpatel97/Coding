class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode result = temp;
        int sum, carry = 0;
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            sum = l1.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l1 = l1.next;
        }
        while(l2!=null){
            sum = l2.val + carry;
            carry = sum/10;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            l2 = l2.next;
        }
        if(carry > 0)
            temp.next = new ListNode(1);
        return result.next;    
    }
}