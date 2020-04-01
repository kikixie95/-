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
    public boolean isSubtree(TreeNode s, TreeNode t) {
       return preorder(s,t);
    }
    public boolean check(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        
        return s.val == t.val && check(s.left,t.left)&& check(s.right,t.right);
    }
    public boolean preorder(TreeNode s, TreeNode t){
        return s!= null && (check(s,t) || preorder(s.left,t)||preorder(s.right,t));
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
    public boolean isSubtree(TreeNode s, TreeNode t) {
      if(s == null) return false;
        if(check(s,t)) return true;
        return isSubtree(s.left,t)|| isSubtree(s.right,t);
    }
    public boolean check(TreeNode s, TreeNode t){
        if(s == null && t ==null) return true;
        if(s == null || t == null) return false;
        if(s.val != t.val) return false;
        
        return check(s.left,t.left) && check(s.right, t.right);
    }
}