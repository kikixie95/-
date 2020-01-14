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
    int len;
    public int diameterOfBinaryTree(TreeNode root) {
           max(root) ;
         return len;
      
    }
    
    public int max(TreeNode node){
        if(node ==  null) return 0;
        int left =  max(node.left);
        int right =  max(node.right);
        len = Math.max(len, left + right);
        return Math.max(left,right) +1;
       
    }
}