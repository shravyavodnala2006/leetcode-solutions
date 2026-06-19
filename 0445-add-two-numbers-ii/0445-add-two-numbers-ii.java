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
        ListNode h1=reverse(l1);
        ListNode h2=reverse(l2);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        int rem,res;
        while(h1!=null && h2!=null){
            res=h1.val+h2.val+carry;
            rem=res%10;
            carry=res/10;
            temp.next=new ListNode(rem);
            h1=h1.next;
            h2=h2.next;
            temp=temp.next;
        }
        while(h1!=null ){
            res=h1.val+carry;
            rem=res%10;
            carry=res/10;
            temp.next=new ListNode(rem);
             h1=h1.next;
            temp=temp.next;
        }
        while(h2!=null){
            res=h2.val+carry;
            rem=res%10;
            carry=res/10;
            temp.next=new ListNode(rem);
            h2=h2.next;
            temp=temp.next;
        }     
        if(carry!=0){
            temp.next=new ListNode(carry);
        }
        return reverse(dummy.next);
    }
    static ListNode reverse(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode rh=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rh;
    }
}