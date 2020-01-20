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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        queue.addLast(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size-1; i++){
                TreeNode tmp = queue.peekFirst();
                if(tmp.left != null)
                queue.addLast(tmp.left);
                if(tmp.right != null)
                queue.addLast(tmp.right);
                
                queue.pollFirst();
            }
            TreeNode tmp = queue.peekFirst();
                if(tmp.left != null)
                queue.addLast(tmp.left);
                if(tmp.right != null)
                queue.addLast(tmp.right);
                res.add(tmp.val);
                queue.pollFirst();
            
        }
        return res;
    }
}