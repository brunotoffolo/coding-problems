/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return recursiveDepth(root, 1);
    }
    
    public int recursiveDepth(TreeNode node, int currentDepth) {
        if (node.left == null && node.right == null) return currentDepth;
        
        int leftDepth = currentDepth;
        if (node.left != null) leftDepth += recursiveDepth(node.left, currentDepth);
        
        int rightDepth = currentDepth;
        if (node.right!= null) rightDepth += recursiveDepth(node.right, currentDepth);
        
        return (leftDepth > rightDepth) ? leftDepth : rightDepth;
    }
}
