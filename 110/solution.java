/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
      return Math.abs(helper(root.left) -helper(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    
    public int helper( TreeNode node){
        if(node == null ) return 0;
        return Math.max(helper(node.left), helper(node.right)) +1;
    }
}