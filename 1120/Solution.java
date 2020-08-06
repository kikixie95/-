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
class ReturnType{
    int sum;
    int size;
    public ReturnType(int sum, int size){
        this.sum = sum;
        this.size = size;
    }
}
class Solution {
    double res;
    public double maximumAverageSubtree(TreeNode root) {
        helper(root);
        return res;
    }
    public ReturnType helper(TreeNode root){
        if(root == null) return new ReturnType(0,0);
        
        ReturnType left = helper(root.left);
        ReturnType right = helper(root.right);
        int curSum = left.sum +right.sum +root.val;
        int curSize = left.size+right.size+1;
        
        double avg = (double)curSum/curSize;
        res = Math.max(res,avg);
        return new ReturnType(curSum, curSize);
    }
}