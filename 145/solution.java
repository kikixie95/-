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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) return res;
        TreeNode lastVis = null;
        while(!stack.isEmpty()|| root != null){
          while(root != null){
              stack.addLast(root);
              root = root.left;  
          }
            TreeNode cur = stack.peekLast();
            if(cur.right == null || cur.right == lastVis){
                lastVis = stack.removeLast();
                res.add(cur.val);
            }
            else if(cur.right != null){
                root = cur.right;
            }
        }
        return res;
    }
}