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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
   
        TreeNode root = helper(nums,0,nums.length);
        return root;
    }
    public TreeNode helper(int[] nums,int left, int right){
        if(left == right ) return null;
          int max  = left;
            for(int i = left; i < right;i++){
              if(nums[max] < nums[i]){
                  max = i;
              }
            }
        
        TreeNode node = new TreeNode(nums[max]);
        node.left = helper(nums,left,max);
        node.right= helper(nums,max+1,right);
        return node;
    }
}