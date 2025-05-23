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
       ListNode slow=head;
       ListNode fast=head;
       for(int i=1;i<k;i++){
        fast=fast.next;
       }
       ListNode p1=fast;
       ListNode p2=head;
       while(fast.next!=null){
        slow=slow.next;
        fast=fast.next;
       }
       p2=slow;
       int temp;
       temp=p1.val;
       p1.val=p2.val;
       p2.val=temp;
       return head;
    }

}