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
    public ListNode removeNodes(ListNode head) {
        ListNode rev=reverseList(head);
        ListNode temp=rev.next;
        ListNode prev=rev;
        int max=rev.val;
        while(temp!=null){
            max=Math.max(max,temp.val);
            if(temp.val<max){
                prev.next=prev.next.next;
                temp=prev.next;
            }
            else{
                temp=temp.next;
                prev=prev.next;
            }          
        }
        ListNode newhead=reverseList(rev);
        return newhead;
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