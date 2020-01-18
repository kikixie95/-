/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

//iteration
class Solution {
    
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;
        ArrayDeque<Node>queue = new ArrayDeque<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
           
            for(int i = 0; i < size; i++){
                for(Node node : queue.peekFirst().children){
                queue.addLast(node);}
                list.add(queue.removeFirst().val);
            }
            res.add(list);
            
        }
        return res;
    }
}

//recursion
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
     List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return res;
        BFS(root,0);
        return res;
        
    }
    public void BFS(Node node, int level){
        if(res.size() <= level)  res.add(new ArrayList<>());
        
        res.get(level).add(node.val);
        for(Node n : node.children){
            BFS(n,level +1);
        }
    }
}