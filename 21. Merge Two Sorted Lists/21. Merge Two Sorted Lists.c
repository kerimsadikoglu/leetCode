/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 void insert(struct ListNode **head_ref, int new_val) {
    //1. Yeni bir düğüm oluşturun ve değerini atayın
    struct ListNode *new_node = (struct ListNode*) malloc(sizeof(struct ListNode));
    new_node->val = new_val;
    new_node->next = NULL;
    
    //2. Eğer başlangıç düğümü yoksa, yeni düğümü başlangıç düğümü olarak ayarlayın
    if (*head_ref == NULL) {
        *head_ref = new_node;
        return;
    }
    
    //3. Son düğümü bulmak için listenin sonuna kadar ilerleyin
    struct ListNode *last_node = *head_ref;
    while (last_node->next != NULL) {
        last_node = last_node->next;
    }
   last_node->next = new_node;
 }   
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode *head = NULL;
    if(list1==NULL)
    return list2;
    if(list2==NULL)
    return list1;
    while(list1!=NULL && list2!=NULL){
        if(list1->val>list2->val){
            insert(&head,list2->val);
            list2=list2->next;
        }
        else{
            insert(&head,list1->val);
            list1=list1->next;
        }
    }
    if(list1==NULL){
        while(list2!=NULL){
            insert(&head,list2->val);
            list2=list2->next;
        }
    }else if(list2==NULL){
        while(list1!=NULL){
            insert(&head,list1->val);
            list1=list1->next;
        }
    }
    return head;
    

}