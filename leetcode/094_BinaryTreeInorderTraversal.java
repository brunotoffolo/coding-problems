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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        
        List<Integer> solution = new LinkedList<Integer>();
        solution.addAll( inorderTraversal(root.left) );
        solution.add(root.val);
        solution.addAll( inorderTraversal(root.right) );
        return solution;
    }
}
