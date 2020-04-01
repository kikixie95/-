/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// iterative
class Solution {
    public String tree2str(TreeNode t) {
       Deque<TreeNode> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        stack.add(t);
        HashSet<TreeNode> visited = new HashSet<>();
        while(!stack.isEmpty()){
            TreeNode tmp = stack.peekLast();
            if(visited.contains(tmp)){
                stack.removeLast();
                sb.append(")");
            }else{
                visited.add(tmp);
                sb.append("("+tmp.val);
                if(tmp.left == null && tmp.right != null){
                    sb.append("()");
                }
                if(tmp.right != null){
                    stack.addLast(tmp.right);
                }
                if(tmp.left != null){
                    stack.addLast(tmp.left);
                }
            }
           
        }
         return sb.substring(1,sb.length()-1);
       
    }
}
// recursive

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
    public String tree2str(TreeNode t) {
       if(t == null) return "";
        if(t.left == null && t.right == null) return t.val+"";
        if(t.right == null) return t.val +"("+tree2str(t.left)+")";
        
        return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
       
    }
}