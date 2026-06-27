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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        ListNode temp=head;
        while(temp!=null){
            if(st.contains(temp.val)){
                temp=temp.next;
                p.next=temp;
            }
            else{
               if(temp==head){
                p.next=temp;
               }
               temp=temp.next;
               p=p.next;  
            }
        }
        return dummy.next;
    }
}