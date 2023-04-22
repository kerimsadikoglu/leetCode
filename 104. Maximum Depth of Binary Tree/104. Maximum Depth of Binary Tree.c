/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root){
    if (root == NULL) { 
        return 0;
    }
    else {
        int leftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right); 
        if (leftDepth > rightDepth) { 
            return(leftDepth + 1);
        }
        else {
            return(rightDepth + 1);
        }
    }
}