/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// Traverse
class Solution {
    
    ArrayList<Integer> res = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
    //递归的定义：把以root为根的inorder放入res里
    public void helper(TreeNode root){
        //递归的出口
        if(root == null){
            return;
        }
        //递归的过程
        helper(root.left);
        res.add(root.val);
        helper(root.right);
        
    }
}

//Divide and Conquer

class Solution {
    //递归的定义：返回以root为根的inorder
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();
        //递归的出口
        if(root == null) return res;
        
        //divide and conquer
        
        List<Integer> left = inorderTraversal(root.left);
        List<Integer> right = inorderTraversal(root.right);
        
        //merge 
        res.addAll(left);
        res.add(root.val);
        res.addAll(right);
        
        return res;
    }
}

//iterative

class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
    
        ArrayList<Integer> res = new ArrayList();
        if(root == null) return res;
        
        ArrayDeque<TreeNode> stack = new ArrayDeque();
        TreeNode node = root;
        while(!stack.isEmpty() || node != null){
            while(node != null){
                stack.addLast(node);
                node = node.left;
            }
            node = stack.removeLast();
            res.add(node.val);
            node = node.right;
        }
        return res;
    }
}