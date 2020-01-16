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
    public TreeNode sortedArrayToBST(int[] nums) {
        if( nums.length == 0) return null;
        return bst(nums,0,nums.length-1);
    }
    
    public TreeNode bst(int[] nums, int begin, int end){
        if( begin > end ) return null;
        int mid = (begin + end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums, begin,mid-1);
        node.right = bst(nums, mid+1,end);
        return node;
    }
}