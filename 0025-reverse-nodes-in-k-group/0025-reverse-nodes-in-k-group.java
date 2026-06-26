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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp=head;
        ListNode nextNode=null;
        ListNode prevLast=null;

        while(temp!=null){
            ListNode KthNode=findKthNode(temp,k);
            if(KthNode==null){
                if(prevLast!=null){
                    prevLast.next=temp;
                    
                }    
                break;     
            }
            nextNode=KthNode.next;
            KthNode.next=null;
            reverseList(temp);
            if(temp==head){
                head=KthNode;
            }
            
            else{               
                prevLast.next=KthNode;
            }
            prevLast=temp;
            temp=nextNode;
        }
           return head;         
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
    static ListNode findKthNode(ListNode temp,int k){
        while(temp!=null){
            k--;
            if(k==0){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    static int len(ListNode temp){
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }

}