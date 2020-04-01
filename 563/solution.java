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
    int sum = 0;
    public int findTilt(TreeNode root) {
        sum(root);
        return sum;
        
    }
    public int sum(TreeNode node){
        if(node == null) return 0;
        
         int left = sum(node.left) ;
        int right = sum(node.right);
        sum += Math.abs(left-right);
        return left+right+node.val;
    }
}