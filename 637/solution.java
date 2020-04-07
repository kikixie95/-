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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> res = new ArrayList();
        ArrayDeque<TreeNode> queue = new ArrayDeque();
        if(root == null) return res;
        queue.add(root);
        TreeNode tmp = null;
        int size = 0;
        double sum = 0;
        while(!queue.isEmpty()){
            size = queue.size();
            sum = 0;
            for(int i = 0; i < size;i++){
                tmp = queue.removeFirst();
                sum+=tmp.val;
                if(tmp.left != null){
                    queue.add(tmp.left);
                }
                if(tmp.right != null){
                    queue.add(tmp.right);
                }
            }
                sum /= size;
                res.add(sum);
        }
        return res;
    }
}