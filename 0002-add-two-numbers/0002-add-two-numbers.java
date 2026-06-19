/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1=l1;
        ListNode h2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int carry=0;
        int res,rem;
        while(h1!=null && h2!=null){
            res=h1.val+h2.val+carry;
            rem=res%10;
            carry=res/10;
            t.next=new ListNode(rem);
            h1=h1.next;
            h2=h2.next;
            t=t.next;
        }
        while(h1!=null){
            res=h1.val+carry;
            rem=res%10;
            carry=res/10;
            t.next=new ListNode(rem);
            h1=h1.next;
            t=t.next;
        }
         while(h2!=null){
            res=h2.val+carry;
            rem=res%10;
            carry=res/10;
            t.next=new ListNode(rem);
            h2=h2.next;
            t=t.next;
        }
        if(carry!=0){
            t.next=new ListNode(carry);
        }
        
        return dummy.next;
    }
}