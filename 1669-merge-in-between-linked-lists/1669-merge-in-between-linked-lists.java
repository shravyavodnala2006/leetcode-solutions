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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode a1=null;
        ListNode b1=null;
        while(temp!=null){
            if(a==1) a1=temp;
            if(b==-1) b1=temp;
            a--;
            b--;
            temp=temp.next;
        }
        a1.next=list2;
        temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=b1;
        return list1;
    }
}