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
  ArrayList<TreeNode> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
      return findRoot(list);
    }
  public void inOrder(TreeNode root){
    if(root == null) return;
    inOrder(root.left);
    list.add(root);
    inOrder(root.right);
  }
  public TreeNode findRoot(ArrayList<TreeNode> list){
          if(list.isEmpty()) return null;
          int mid = list.size()/2;
         TreeNode node = list.get(mid);
          node.left = findRoot(new ArrayList<TreeNode>(list.subList(0,mid)));
          node.right = findRoot(new ArrayList<TreeNode>(list.subList(mid+1,list.size())));
    return node;
  }
}