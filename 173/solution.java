/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    ArrayDeque<TreeNode> stack = new ArrayDeque<>();
    ArrayDeque<Integer> queue = new ArrayDeque<>();
    public BSTIterator(TreeNode root) {
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                stack.addLast(cur);
                cur = cur.left;
            }
            cur = stack.removeLast();
            queue.addLast(cur.val);
            cur = cur.right;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        return queue.removeFirst();
       
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(!queue.isEmpty()){
            return true;
        }
        else return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */