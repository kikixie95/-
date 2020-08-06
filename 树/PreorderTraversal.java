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

// divide and conquer
class Solution {
    //递归的定义：返回以root为根的preorder
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList();
        //递归的出口
        if(root == null) return res;
        
        // 递归的过程：
    
        //divide
        List<Integer> left = preorderTraversal(root.left);
        List<Integer>right = preorderTraversal(root.right);
        
        //conquer
        res.add(root.val);
        res.addAll(left);
        res.addAll(right);
        
        return res;
    }
}
// traversal
class Solution {
    ArrayList<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
        this.res = new ArrayList();
        //调用递归
        helper(root);
        return res;
    }
     //递归的定义：把以root为根的preorder加入res
    public void helper(TreeNode root){
         //递归的出口
        if(root == null) return;
           // 递归的过程：
        res.add(root.val);
        helper(root.left);
        helper(root.right);

    }
}

// Iterative
class Solution {
    ArrayList<Integer> res;
    public List<Integer> preorderTraversal(TreeNode root) {
        this.res = new ArrayList();
        if(root == null) return res;
      ArrayDeque<TreeNode> stack = new ArrayDeque();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.removeLast();
            res.add(node.val);
            if(node.right != null){
                stack.addLast(node.right);
            }
            if(node.left != null){
                stack.addLast(node.left);
            }
        }
        return res;

    }
}
