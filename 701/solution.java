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
    public TreeNode insertIntoBST(TreeNode root, int val) {
         helper(root,val);
        return root;
    }
    public TreeNode helper(TreeNode node, int val){
        if(node == null) return new TreeNode(val);
        
        if(node.val < val){
            node.right = helper(node.right,val);
     
        }
        else node.left =  helper(node.left,val);
       return node;
    }
}