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
    HashMap<String, Integer> map = new HashMap(); 
    ArrayList<TreeNode> list = new ArrayList();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return list;
        
    }
    public String helper(TreeNode node){
        if(node == null) return "#";
        String path = node.val + "," + helper(node.left) + helper(node.right);
        map.put(path, map.getOrDefault(path,0)+1);
        if(map.get(path) == 2){
            list.add(node);
        }
        return path;
    }
}