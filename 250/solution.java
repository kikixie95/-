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
    int num = 0;
    public int countUnivalSubtrees(TreeNode root) {
        helper(root);
        return num;
    }
    public Integer helper(TreeNode node){
        if(node == null) return null;
        
      Integer left = helper(node.left);
       Integer right = helper(node.right);
        
        if((node.left == null ||(left!= null&&left.equals((Integer)node.val))) && (node.right == null || (right != null &&right.equals((Integer)node.val)))){
            num++;
            return (Integer)node.val;
        }
    else
        return null;
        }
       
    }
