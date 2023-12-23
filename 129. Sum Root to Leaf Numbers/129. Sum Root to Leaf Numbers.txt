# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sumNumbers(self, root):
        def dfs(node, current_number):
            if not node:
                return 0
            current_number = current_number * 10 + node.val
            if not node.left and not node.right:  # Check if it's a leaf node
                return current_number
            # Recurse on left and right children
            return dfs(node.left, current_number) + dfs(node.right, current_number)
        
        return dfs(root, 0)