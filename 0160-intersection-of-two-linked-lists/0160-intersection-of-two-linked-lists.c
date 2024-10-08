/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
     struct  ListNode *ListAval=headA;
    struct  ListNode *ListBval=headB;
    while(ListAval!=ListBval){
        if(ListAval==NULL){
            ListAval=headB;
        }
        else{
            ListAval=ListAval->next;
        }
         if(ListBval==NULL){
            ListBval=headA;
        }
        else{
            ListBval=ListBval->next;
        }
    }
 return ListAval;      
}