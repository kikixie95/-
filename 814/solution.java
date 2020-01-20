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
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;
        if(hasZero(root) == false) return null;
        else return root;
    }
    public boolean hasZero(TreeNode node){
        if(node == null) return false;
        
        boolean left = hasZero(node.left);
        boolean right = hasZero(node.right);
        
        if(left == false) node.left = null;
        if(right == false) node.right = null;
        
        return  node.val==1 || left || right;
    }
    
}