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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode t1=head;
        int cnt=0;
        while(t1!=null){
            cnt++;
            t1=t1.next;
        }
        k=k%cnt;
        if (k == 0) {
            return head;
        }

        t1 = head;
        for (int i = 1; i < cnt - k; i++) {
            t1 = t1.next;
        }
        ListNode t2=t1.next;
        ListNode newhead=t1.next;
        while(t2.next!=null){
            t2=t2.next;
        }
        t2.next=head;
        t1.next=null;
        return newhead;
    }
}