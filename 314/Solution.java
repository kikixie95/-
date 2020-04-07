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
    class Node{
        TreeNode node;
        int col;
        public Node(TreeNode node, int col){
            this.node = node;
            this.col = col;
        }
    }
    
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
       TreeMap<Integer,ArrayList<Integer>> map = new TreeMap();
        ArrayDeque<Node> queue = new ArrayDeque<>();
        
        queue.add(new Node(root,0));
        Node tmp = null;
        int size = 0, idx = 0;
        while(!queue.isEmpty()){
            size = queue.size();
            for(int i = 0; i < size;i++){
               tmp = queue.removeFirst();
                idx = tmp.col;
             if(!map.containsKey(tmp.col)){
                 map.put(tmp.col,new ArrayList());
             }
                map.get(tmp.col).add(tmp.node.val);
              
               // System.out.println(map.size());
                if(tmp.node.left!= null){
                    queue.add(new Node(tmp.node.left,idx-1));
                }
                if(tmp.node.right != null){
                    queue.add(new Node(tmp.node.right,idx+1));
                }
            }
        }
        
        List<List<Integer>> res = new ArrayList(map.values());
        return res;
        
    }
}