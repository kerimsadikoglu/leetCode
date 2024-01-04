/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution
{
    public IList<string> BinaryTreePaths(TreeNode root)
    {
        List<string> paths = new List<string>();
        if (root != null)
        {
            FindPaths(root, "", paths);
        }
        return paths;
    }

    private void FindPaths(TreeNode node, string currentPath, List<string> paths)
    {
        // Add the current node's value to the currentPath
        currentPath += node.val.ToString();

        // If the current node is a leaf node, add the path to the list of paths
        if (node.left == null && node.right == null)
        {
            paths.Add(currentPath);
        }
        else
        {
            // If the node has a left child, recursively search the left subtree
            if (node.left != null)
            {
                FindPaths(node.left, currentPath + "->", paths);
            }

            // If the node has a right child, recursively search the right subtree
            if (node.right != null)
            {
                FindPaths(node.right, currentPath + "->", paths);
            }
        }
    }
}