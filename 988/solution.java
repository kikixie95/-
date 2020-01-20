
//backtracking

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
    String ans = "{";
    
    public String smallestFromLeaf(TreeNode root) {
        if(root == null) return "";
        helper(root, new StringBuilder());
        return ans;
        
    }
    
    public void helper(TreeNode node,StringBuilder sb){
        if(node == null) return;
        
        sb.append((char)('a'+node.val));
        
        if(node.left == null && node.right == null){
           sb.reverse();
           String s = sb.toString();
           sb.reverse();
           if(s.compareTo(ans) < 0)
                ans = s;
                
        }
        
        helper(node.left, sb);
        // sb.deleteCharAt(sb.length()-1);
        helper(node.right, sb);
        
        sb.deleteCharAt(sb.length()-1);
        
    }
}

// build new string builders for every path
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
    String ans = "{";
    
    public String smallestFromLeaf(TreeNode root) {
        if(root == null) return "";
        helper(root, new StringBuilder());
        return ans;
        
    }
    
    public void helper(TreeNode node,StringBuilder sb){
        if(node == null) return;
        
        sb.append((char)('a'+node.val));
        
        if(node.left == null && node.right == null){
           sb.reverse();
           String s = sb.toString();
           if(s.compareTo(ans) < 0)
                ans = s;
                
        }
        
        
        helper(node.left,new StringBuilder(sb.toString()));
        helper(node.right, new StringBuilder(sb.toString()));
        
    }
}