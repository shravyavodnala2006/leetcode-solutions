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
    public int pairSum(ListNode head) {
        ListNode t1=head;
        ListNode mid=middleNode(head);
        ListNode t2=reverseList(mid);
        int maxi=0;
        int sum=0;
        while(t1!=null && t2!=null){
            sum=t1.val+t2.val;
            maxi=Math.max(sum,maxi);
            t1=t1.next;
            t2=t2.next;
        }
        return maxi;
    }
    static ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }        
        return s;
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