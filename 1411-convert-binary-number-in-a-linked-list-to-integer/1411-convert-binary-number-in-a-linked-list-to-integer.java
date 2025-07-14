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
    public int getDecimalValue(ListNode head) {
       ListNode val=head;
       StringBuilder a=new StringBuilder();
       while(val!=null){
        a.append(val.val);
        val=val.next;
       }
       int val1=Integer.parseInt(a.toString(),2);
       return val1; 
    }
}