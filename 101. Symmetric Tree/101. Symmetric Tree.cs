public class Solution {
    public bool IsSymmetric(TreeNode root) {
        if (root == null) {
            return true; // An empty tree is symmetric.
        }
        
        return IsMirror(root.left, root.right);
    }
    
    private bool IsMirror(TreeNode leftSubtree, TreeNode rightSubtree) {
        if (leftSubtree == null && rightSubtree == null) {
            return true; // Both subtrees are empty, so they are symmetric.
        }
        
        if (leftSubtree == null || rightSubtree == null) {
            return false; // One subtree is empty, but the other is not, so they are not symmetric.
        }
        
        if (leftSubtree.val != rightSubtree.val) {
            return false; // Values of the current nodes do not match, so they are not symmetric.
        }
        
        // Recursively check if the left subtree's left matches the right subtree's right
        // and if the left subtree's right matches the right subtree's left.
        return IsMirror(leftSubtree.left, rightSubtree.right) && IsMirror(leftSubtree.right, rightSubtree.left);
    }
}