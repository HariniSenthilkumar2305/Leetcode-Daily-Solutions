struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int result1 = 0, result2 = 0;
    struct ListNode* current1 = NULL;
    struct ListNode** current2 =&current1 ;

    // Calculate result1 from l1
    int carry=0;
    while (l1!=NULL || l2!=NULL || carry!=NULL) {
        int sum=carry;
        if(l1!=NULL){
            sum=sum+l1->val;
            l1=l1->next;
        }
        if(l2!=NULL){
            sum=sum+l2->val;
            l2=l2->next;
        }
        carry=sum/10;
        sum=sum%10;
        struct ListNode* newnode=malloc(sizeof(struct ListNode));
        newnode->val=sum;
        newnode->next=NULL;
        *current2=newnode;
        current2=&((*current2)->next);
    }
    return current1;
}