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
class Solution {
    ArrayList<Integer>list = new ArrayList();
    int max = 0;
    int count = 0;
    Integer pre = null;
    public int[] findMode(TreeNode root) {
      
        helper(root);
      
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) res[i] = list.get(i);
        return res;
    }
    public void helper(TreeNode node){
        if(node == null) return;
        
        helper(node.left);
        if(pre!= null && pre == node.val){
            count++;
        }else{
            count = 1;
        }
        pre = node.val;
       if(count > max){
           list.clear();
           max = count;
           list.add(node.val);
       }
        else if(count == max){
            list.add(node.val);
        }
        helper(node.right);
    }
}