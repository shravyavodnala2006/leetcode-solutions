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
    public ListNode doubleIt(ListNode head) {
       ListNode t1=head;
       ListNode rh1=reverseList(t1);
       ListNode dummy=new ListNode(-1);
       ListNode ans=dummy;
       dummy.next=rh1;
       int carry=0;
       int res,rem;
       while(rh1!=null){
            res =rh1.val+rh1.val+carry;
            rem=res%10;
            carry=res/10;
            ans.next=new ListNode(rem);
            rh1=rh1.next;
            ans=ans.next;
       }
       if(carry!=0){
        ans.next=new ListNode(carry);
       }
       return reverseList(dummy.next);
    }
    static ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode rh=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return rh;
    }
}