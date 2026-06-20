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
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null) return head;
        ListNode t1=head;
        ListNode t2=head.next;
        ListNode newhead=t2;
        ListNode p=null;
         while(t1!=null && t2!=null){ 
            ListNode next=t2.next;    
            t2.next=t1;
            t1.next=next;
            if(p!=null) p.next=t2;    
            p=t1;
            if(next==null || next.next==null) break; 
            t1=next;                 
            t2=t1.next;
        }
        return newhead;
    }
}