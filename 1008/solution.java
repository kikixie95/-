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
    int idx = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(Integer.MIN_VALUE,Integer.MAX_VALUE,preorder);
    }
    public TreeNode helper( int low, int high,int[] preorder){
        if(idx == preorder.length) return null;
        
        int val = preorder[idx];
        if(val < low || val>high) return null;
        idx++;
        TreeNode node = new TreeNode(val);
        node.left = helper(low,val,preorder);
        node.right = helper(val,high,preorder);
        return node;
    }
}