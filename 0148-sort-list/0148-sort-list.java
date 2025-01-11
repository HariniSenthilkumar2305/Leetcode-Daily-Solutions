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
    public ListNode sortList(ListNode head) {
        if(head==null){
            return head;
        }
       ListNode current=head;
       ArrayList<Integer>value=new ArrayList<>();
       while(current!=null){
        value.add(current.val);
        current=current.next;
       }
       Collections.sort(value);
       ListNode res=new ListNode(value.get(0));
       current=res;
       for(int i=1;i<value.size();i++){
        ListNode resultant=new ListNode(value.get(i));
        current.next=resultant;
        current=current.next;
       }
       return res;
    }
}