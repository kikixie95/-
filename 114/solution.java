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
    public void flatten(TreeNode root) {
       
       helper(root);
        
    }
    public TreeNode helper(TreeNode node){
        if(node == null) return null;
        if(node.left == null && node.right == null) return node;
        
        TreeNode left = helper(node.left);
        TreeNode right = helper(node.right);
        
        if(left != null){
            left.right = node.right;
            node.right =node.left;
            node.left = null;
        }
           return right == null?left:right; 
    }
   
  
}