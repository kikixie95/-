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
    HashMap<TreeNode, Integer> heightTable = new HashMap<>();
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        getHeight(root);
        heightTable.put(null,0);
        return getLCA(root);
    }

    public int getHeight(TreeNode root){
        if(root == null) return 0;
        int l_height = this.getHeight(root.left);
        int r_height = this.getHeight(root.right);
        int h = Math.max(l_height,r_height)+1;
        this.heightTable.put(root,h);
        return h;
    }
    
    public TreeNode getLCA(TreeNode root){
        
        if(heightTable.get(root.left) == heightTable.get(root.right)) 
            return root;
        else if(heightTable.get(root.left) >heightTable.get(root.right))
            return  getLCA(root.left);
        else 
            return getLCA(root.right);
    }
}