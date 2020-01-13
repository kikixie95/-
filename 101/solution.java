// Recursion

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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root, root);
        
    }
    public boolean helper(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        
        return (left.val == right.val) && helper(left.left,right.right) && helper(left.right, right.left);
    }
    
}

// Iterative
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
    public boolean isSymmetric(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return true;
        
        queue.add(root);
        queue.add(root);
        
        while(!queue.isEmpty()){
           TreeNode r1 = queue.poll();
            TreeNode r2 = queue.poll();
            
            if(r1 == null && r2 == null) continue;
            if(r1 == null || r2 == null) return false;
            if(r1.val != r2.val) return false;

            queue.add(r1.left);
            queue.add(r2.right);
            queue.add(r2.left);
            queue.add(r1.right);
        
        }
        return true;
    }
}