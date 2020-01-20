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
    int Max;
    public int longestUnivaluePath(TreeNode root) {
        Max=0;
        maxLen(root);
        return Max;
    }
    
    public int maxLen(TreeNode root){
         if (root == null) return 0;
        int left = maxLen(root.left);
        int right  = maxLen(root.right);
        
        int left_max = 0, right_max = 0;
        
        if( root.left!= null && root.val == root.left.val )
        {
          left_max += left +1;
        }
         if( root.right!= null && root.val == root.right.val)
        {
          right_max += right +1;
        }
        
        Max = Math.max(Max, left_max + right_max);
        return Math.max(left_max, right_max);
    }
   
}