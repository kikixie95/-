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
    
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> vals =  new ArrayList<>();
        TreeNode res = new TreeNode(0), curr = res;
        inOrder(root,vals);
      for(int node: vals){
          curr.right = new TreeNode(node);
          curr = curr.right;
      }
        return res.right;
        
        
    }
    
    public void inOrder(TreeNode node, List<Integer> vals){
        if(node == null) return;
        inOrder(node.left, vals);
        vals.add(node.val);
        inOrder(node.right,vals);
    }
    
}