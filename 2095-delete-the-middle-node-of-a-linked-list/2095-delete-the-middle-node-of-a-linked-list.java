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
    public ListNode deleteMiddle(ListNode head) {
        if (head==null ||head.next == null) {
            return null;
        }
        if (head.next.next == null) {
            head.next = null;
            return head;
        }
        ListNode midbefore=middle(head);
        midbefore.next= midbefore.next.next;
        return head;
    }
    static ListNode middle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        ListNode prev=head;
        while(f.next!=null && f.next.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }
        if (f.next == null) {
            return prev;     
        }
        return prev.next;
    }
}