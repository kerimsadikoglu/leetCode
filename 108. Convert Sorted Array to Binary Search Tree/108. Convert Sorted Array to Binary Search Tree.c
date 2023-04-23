struct TreeNode* bst(int* nums, int start, int end){
    if(start > end)
        return NULL;
    int mid = (start+end)/2;
    
    struct TreeNode* root = malloc(sizeof(struct TreeNode));
    
    root->val = nums[mid];
    root->left = bst(nums, start, mid-1);
    root->right = bst(nums, mid+1, end);
    
    return root;
}

struct TreeNode* sortedArrayToBST(int* nums, int numsSize){
    int start = 0, end = numsSize-1;
    int mid = (start+end)/2;
    
    return bst(nums, start, end);
    
}