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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    
        return helper(root,p.val,q.val);
    }
    public TreeNode helper(TreeNode node, int a, int b){
      if(node == null) return null;
        
        if(node.val < Math.min(a,b)){
             return helper(node.right, a,b);
        }
        else if(node.val > Math.max(a,b)){
           return  helper(node.left, a,b);
        }else{
            return  node;
        }

    }
}