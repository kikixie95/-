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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList();
         ArrayList<Integer> l2 = new ArrayList();
        leaves(root1,l1);
        leaves(root2,l2);
        return l1.equals(l2);
        
    }
    public void leaves(TreeNode node, ArrayList<Integer> list){
        if( node != null){
        if(node.left == null && node.right == null){
            list.add(node.val);
        }
        leaves(node.left,list);
        leaves(node.right,list);
    }
    }
}