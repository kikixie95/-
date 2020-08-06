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
//Traverse
class Solution {
    ArrayList<Integer> res;
  
    public List<Integer> postorderTraversal(TreeNode root) {
        res = new ArrayList();
        helper(root);
        return res;
    }
      //递归的定义：将root的postorder 放进res
    public void helper(TreeNode root){
        //递归的出口
        if(root == null) return;
        
        // 递归的过程： postorder traverse and put it into the res
        helper(root.left);
        helper(root.right);
        res.add(root.val);
        
    }
}


// Divide and conquer

class Solution {
    //递归的定义：返回root为根的postorder
    public List<Integer> postorderTraversal(TreeNode root) {
         ArrayList<Integer> res = new ArrayList();
        //递归的出口
        if(root == null){
            return res;
        }
        //递归的过程:
        
        //divide
         List<Integer>left = postorderTraversal(root.left);
        List<Integer>right = postorderTraversal(root.right);
        
        
        //merge
          res.addAll(left);
          res.addAll(right);
          res.add(root.val);
        
        return res;
    }
}

//Traverse

class Solution {
    ArrayList<Integer> res;
    public List<Integer> postorderTraversal(TreeNode root) {
        this.res = new ArrayList();
        if(root == null) return res;
        
        ArrayDeque<TreeNode> stack = new ArrayDeque();
        stack.addLast(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.removeLast();
            res.add(0,node.val);
            if(node.left != null){
                stack.addLast(node.left);
            }
            if(node.right != null){
                stack.addLast(node.right);
            }
        }
        return res;
    }
}

