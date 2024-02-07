/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var totalTilt = 0
    
    fun findTilt(root: TreeNode?): Int {
        calculateTilt(root)
        return totalTilt
    }
    
    private fun calculateTilt(node: TreeNode?): Int {
        if (node == null) return 0
        
        val leftSum = calculateTilt(node.left)
        val rightSum = calculateTilt(node.right)
        
        val tilt = Math.abs(leftSum - rightSum)
        totalTilt += tilt
        
        return leftSum + rightSum + node.`val`
    }
}
