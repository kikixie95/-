/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//BFS
class Solution {
    public int maxDepth(TreeNode root) {
        int level;
        int depth=0;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        if(root == null) return 0;
        queue.add(root);
        while(!queue.isEmpty()){
            level= queue.size();
            for(int i=0; i < level;i++){
                TreeNode node = queue.peek();
                if(node.left != null) queue.add(node.left);
                if(node.right != null)queue.add(node.right);
                queue.poll();
            }
            depth++;
            
            
        }
        return depth;
    }
}

//recursive

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) +1;
    }
}
