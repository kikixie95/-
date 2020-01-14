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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        
        helper(root);
        return root;
    }
    
    public void helper(TreeNode node){
       if(node != null){
           TreeNode temp = node.left;
           node.left = node.right;
           node.right = temp;
           helper(node.left);
           helper(node.right);
       }
       
    }
}