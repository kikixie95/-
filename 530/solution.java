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
    int diff = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return diff;
        Diff(root);
        return this.diff;

    }
    
    public void Diff(TreeNode node){
        
      if(node == null) return ;
      
        Diff(node.left);
        
        if(prev == Integer.MAX_VALUE ) 
            prev = node.val;
        else{
            this.diff = Math.min(this.diff,Math.abs(node.val-prev));
            prev = node.val;
        }
        
        Diff(node.right);
    }
}