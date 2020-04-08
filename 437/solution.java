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
    int sum;
    int res = 0;
    public int pathSum(TreeNode root, int sum) {
        this.sum = sum;
        helper(root);
        return res;
    }
    public void helper(TreeNode node){
        if(node == null) return;
        traverse(node,0);
        helper(node.left);
        helper(node.right);
    }
    public void traverse(TreeNode node,int curSum){
        if(node == null) return;
        curSum += node.val;
        if(sum == curSum){
            res++;
        }
        traverse(node.left, curSum);
        traverse(node.right,curSum);
    }
    
}