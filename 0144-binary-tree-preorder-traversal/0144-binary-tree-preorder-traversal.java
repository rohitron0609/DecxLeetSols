/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        helper(sol, root);
        return sol;
    }

    void helper(List<Integer> sol, TreeNode root){
        if(root == null) return;
        sol.add(root.val);
        helper(sol, root.left);
        helper(sol, root.right);
    }
}