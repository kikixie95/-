// DFS
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left ==null && root.right == null) return 1;
        
        int min = Integer.MAX_VALUE;
        
        if(root.left != null) min = Math.min(min,minDepth(root.left));
        if(root.right != null) min = Math.min(min, minDepth(root.right));
        return min+1;
    }
}


//BFS
// DFS
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left ==null && root.right == null) return 1;
        
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        int depth = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode cur = queue.peek();
                if(cur.left == null && cur.right == null) return depth;
              if(cur.left != null)  queue.addLast(cur.left);
               if (cur.right != null) queue.addLast(cur.right);
                queue.poll();
            }
            depth++;
        }
        return depth;
        
        
    }
}