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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-101);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp=head;
        int dup=-101;
        while(temp!=null){
            if(temp.next != null && temp.val==temp.next.val){
                dup=temp.val;
                temp=temp.next.next;
                prev.next=temp;
            }
            else if(dup==temp.val){
                temp=temp.next;
                prev.next=temp;
            }
            else{
                prev=prev.next;
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}