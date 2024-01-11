public class Solution {
    public string Tree2str(TreeNode root) {
        if (root == null) return "";

        string result = root.val.ToString();

        if (root.left != null || root.right != null) {
            result += "(" + Tree2str(root.left) + ")";
        }

        if (root.right != null) {
            result += "(" + Tree2str(root.right) + ")";
        }

        return result;
    }
}
