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
    public boolean isCousins(TreeNode root, int x, int y) {
      
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        if(root.val == x || root.val == y) return false;
        boolean A = false;
        boolean B = false;
        int size = 0;
        TreeNode cur = null;
        while(!queue.isEmpty()){
            A = false;
            B = false;
            size = queue.size();
            for(int i = 0; i < size; i++){
                cur = queue.removeFirst();
               if(cur.val == x)  A = true;
                if(cur.val == y) B = true;
                if(cur.left != null && cur.right != null)
                if((cur.left.val == x && cur.right.val == y )||(cur.left.val == y && cur.right.val == x)) return false;
                    
                if(cur.left != null) {
                    queue.add(cur.left);
                }   
                if(cur.right != null){
                    queue.add(cur.right);
                }
                    
                }
            if(A && B) return true;
          
            }
        return false;

    }
}