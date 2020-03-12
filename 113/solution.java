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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
       DFS(root,sum,new ArrayList<>());
        return res;
    }
    
    public void DFS(TreeNode node, int remainSum, ArrayList<Integer> list){
     if(node == null){
         return;
     }
        list.add(node.val);
        if(remainSum == node.val && node.left == null && node.right == null){
            res.add(new ArrayList<>(list));
        }else{
            DFS(node.left, remainSum - node.val,list);
             DFS(node.right, remainSum - node.val,list);
        }
        
        list.remove(list.size()-1);
        
    }
}