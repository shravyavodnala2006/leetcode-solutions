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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode s=dummy;
        ListNode temp=head;
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                sum=0;
                temp=temp.next;
            }
            else{
                sum+=temp.val;
                if(temp.next.val==0){
                    s.next=new ListNode(sum);
                    s=s.next;
                }
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}