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
    public int minDiffInBST(TreeNode root) {
        if(root == null) return 0;
        minDiffInBST(root.left);
        
        if(prev == Integer.MAX_VALUE) prev = root.val;
        else{
            diff =Math.min(diff,root.val-prev);
            prev = root.val;
        }
        
        minDiffInBST(root.right);
        return diff;
    }
}