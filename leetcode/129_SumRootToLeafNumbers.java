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
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        
        DfsNode rootNode = new DfsNode(root, 0);
        return recursiveDfsSum(rootNode);
    }
    
    private int recursiveDfsSum(DfsNode dfsNode) {
        TreeNode currentNode = dfsNode.node;
        int sumUpToThisNode = dfsNode.previousSum * 10 + currentNode.val;
        
        if (currentNode.left == null && currentNode.right == null) {
            return sumUpToThisNode;
        }
        
        int currentSum = 0;
        if (currentNode.left != null) {
            DfsNode leftNode = new DfsNode(currentNode.left, sumUpToThisNode);
            currentSum += recursiveDfsSum(leftNode);
        }
        if (currentNode.right != null) {
            DfsNode rightNode = new DfsNode(currentNode.right, sumUpToThisNode);
            currentSum += recursiveDfsSum(rightNode);
        }
        return currentSum;
    }
}

class DfsNode {
    TreeNode node;
    int previousSum;
    DfsNode(TreeNode node, int previousSum) {
        this.node = node;
        this.previousSum = previousSum;
    }
}
