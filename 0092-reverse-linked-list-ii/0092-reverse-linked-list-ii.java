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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l=head;
        ListNode r=head;
        ListNode temp=head;
        int L=left;
        int R=right;
        while(left!=1){
            left--;
            temp=temp.next;
        }
        l=temp;
        temp=head; 
        while(right!=1){
            right--;
            temp=temp.next;
        } 
        r=temp;
        ListNode after=r.next;
        r.next=null;
        ListNode rev=reverse(l);
        temp=rev;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=after;
         if(L == 1){
            return rev;
        }
        temp = head;
        for(int i = 1; i < L - 1; i++){
            temp = temp.next;
        }
        temp.next = rev;
        return head;
    }
    static ListNode reverse(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode rh=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rh;
    }
}