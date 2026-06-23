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
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        ListNode t1=null;
        ListNode t2=null;
        int cnt=1;
        while(temp!=null){
            
            if(cnt==k)  t1=temp;
            if(cnt==n-k+1) t2=temp;
            cnt++;
            temp=temp.next;
        }
        int val=t1.val;
        t1.val=t2.val;
        t2.val=val;
        return head;
    }
}