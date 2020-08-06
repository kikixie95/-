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
//Iterative
class Solution {
    int mDepth = 0;
    public int maxDepth(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque();
        if(root == null) return mDepth;
        queue.addLast(root);
        while(!queue.isEmpty()){
            mDepth++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.removeFirst();
                if(node.left != null){
                    queue.addLast(node.left);
                }
                if(node.right != null){
                    queue.addLast(node.right);
                }
            }
        }
        return mDepth;
    }
}

// Traversal recursion
class Solution {
    int mDepth = 0;
    public int maxDepth(TreeNode root) {
        helper(root,1);
        return mDepth;
    }
    //递归的定义：以root为根更新最大深度
    public void helper(TreeNode root, int depth){
        //递归的出口
        if(root == null) return;
        //递归的过程
     mDepth = Math.max(mDepth,depth);
        helper(root.left,depth+1);
        helper(root.right,depth+1);
        
    }
}

//Divide and Conquer

class Solution {
    //递归的定义：返回root为根的书的最大深度
    public int maxDepth(TreeNode root) {
        int mDepth = 0;
        //递归的出口
        if(root == null) return mDepth;
        //递归的过程
        mDepth = Math.max(mDepth, Math.max(maxDepth(root.left),maxDepth(root.right)))+1;
        return mDepth;
    }
}