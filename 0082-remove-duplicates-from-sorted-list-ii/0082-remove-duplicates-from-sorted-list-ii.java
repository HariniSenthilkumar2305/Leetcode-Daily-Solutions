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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res=new ListNode();
        ListNode p1=res;
        HashMap<Integer,Integer>a=new HashMap<>();
        List<Integer>order=new ArrayList<>();
        while(head!=null){
            if(!a.containsKey(head.val)){
                order.add(head.val);
            }
            a.put(head.val,a.getOrDefault(head.val,0)+1);
            head=head.next;
        }
        for(int value:order){
            if(a.get(value)==1){
            p1.next=new ListNode(value);
            p1=p1.next;
            }
        }
        return res.next;
    }
}