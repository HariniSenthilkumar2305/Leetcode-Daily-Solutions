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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
         dummy.next=head;
        ListNode prev=dummy;
        ListNode current=head;
while(current!=null && current.next!=null){
    ListNode first=current;
    ListNode second=current.next;
    first.next=second.next;//for swapping
    second.next=first;
    prev.next=second;
    prev=first;//for taking the next part of the element to swap 
    current=first.next;

}
return dummy.next;
    }
}