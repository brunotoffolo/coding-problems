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
    private List<List<Integer>> solution = new LinkedList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return Collections.emptyList();
        
        List<Integer> path = new LinkedList<Integer>();
        traverse(root, sum, path);
        return solution;
    }
    
    public void traverse(TreeNode root, int sum, List<Integer> path) {
        List<Integer> myPath = new LinkedList<Integer>(path);
        myPath.add(root.val);
        
        if (root.val == sum && root.left == null && root.right == null) {
            solution.add(myPath);
            return;
        }
        
        if (root.left != null) traverse(root.left, sum - root.val, myPath);
        if (root.right != null) traverse(root.right, sum - root.val, myPath);
    }
}
