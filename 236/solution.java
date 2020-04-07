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
        return  helper(root,p,q);
    }
    public TreeNode helper(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return null;
        if(node == p || node == q) return node;
        
        TreeNode left = helper(node.left,p,q);
        TreeNode right = helper(node.right, p,q);
        
        if(left != null && right != null )
            return node;
        else if(left == null){
            return right;
        }else{
            return left;
        }
        
       
        
    }
}

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
    int count = 0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null) return null;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        
        TreeNode cur = null;
        TreeNode visited = null;
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.addLast(root);
                root = root.left;
            }
            cur = stack.peekLast();
            if(cur.right == null || cur.right == visited ){
                visited = stack.removeLast();
                count = 0;
                 if(helper(visited,p,q) == 2) break;
            
            }
            else{
                root = cur.right;
            }
            
        }
        return visited;
    }
    public Integer helper(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return null;
        
        if(node == p) count ++;
        else if(node == q) count ++;
        
        helper(node.left,p,q);
        helper(node.right,p,q);
        
        return count;
    }
    
}