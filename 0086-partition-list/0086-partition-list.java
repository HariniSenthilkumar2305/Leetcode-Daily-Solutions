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
    public ListNode partition(ListNode head, int x) {
        ListNode temp1=new ListNode();
        ListNode temp2=new ListNode();
        ListNode p1=temp1;
        ListNode p2=temp2;
        while(head!=null){
            if(head.val<x){
                p1.next=head;
                p1=p1.next;
            }
            else{
                p2.next=head;
                p2=p2.next;
            }
            head=head.next;
        }
        p2.next=null;
        p1.next=temp2.next;
        return temp1.next;
    }
}