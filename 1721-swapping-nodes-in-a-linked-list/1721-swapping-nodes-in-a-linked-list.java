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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode first=head;
        int n=0;
        while(k>1){
            k--;
            first=first.next;
        }
        ListNode t1=first;
        ListNode t2=head;
        while(t1.next!=null){
            t1=t1.next;
            t2=t2.next;
        }
        int val=first.val;
        first.val=t2.val;
        t2.val=val;
        return head;
    }
}